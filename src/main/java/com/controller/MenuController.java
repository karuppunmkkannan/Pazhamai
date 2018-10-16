package com.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CommonDao;
import com.model.Product;




/**
 * @author suresh sampath
 */
@Controller
public class MenuController {

	private static final Logger logger = Logger.getLogger(MenuController.class);

	@Autowired 
	private CommonDao commonDao;


	@GetMapping("/")
	public ModelAndView userForm(Locale locale, Model model) throws IOException {
		ModelAndView view=new ModelAndView("index");
		
		List<Product> prodl= commonDao.getProduct();
		
		File file = new File("C:\\\\Users\\\\Bala\\\\Desktop\\\\iCQIpl5R_400x400.png");		
		byte[] bFile = new byte[(int) file.length()];
		
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(bFile);

	/*	Product prod = new Product();
		prod.setName("test1");
		prod.setImage(bFile);		   
		          commonDao.saveProduct(prod);
		          byte[] blob = prod.getImage();
		          */
	                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();             
	                 
	                for(Product pro:prodl) {
	                	byte[] imageBytes = outputStream.toByteArray();
	                	String base64Image = Base64.getEncoder().encodeToString(pro.getImage());
	                	pro.setBase64Image(base64Image);
	                }
	                 
	                outputStream.close();	                
	                view.addObject("product",prodl);
		logger.info("#########################################################################################");
		return view;
	}
	@GetMapping("/contact")
	public String contactForm(Locale locale, Model model) {

		logger.info("#########################################################################################");
		return "contact";
	}

	
	
	
	@RequestMapping(value = "/Addproduct", method = RequestMethod.POST)
	@ResponseBody
	public String Addproduct(HttpServletRequest request, Model model) throws IOException {
		String msg="";
		MultipartHttpServletRequest multiPart = (MultipartHttpServletRequest) request;
		Iterator<String> itr = multiPart.getFileNames();
		MultipartFile multipartFile = null;
		while (itr.hasNext()) {
			multipartFile = multiPart.getFile(itr.next());
			logger.info("multipartFile===="+multipartFile);
			File file = new File(multipartFile.getOriginalFilename());
			multipartFile.transferTo(file);
		
				byte[] bFile = new byte[(int) file.length()];
		
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(bFile);
		String productName = request.getParameter("insertproductName");
		String qty = request.getParameter("insertQuantity");
		String units = request.getParameter("insertUnits");
		String price = request.getParameter("insertprice");
		
		Product prod = new Product();
		prod.setName("productName");
		prod.setImage(bFile);
		prod.setQty(Integer.valueOf(qty));
		prod.setUnit(units);
		prod.setPrice(Double.parseDouble(price));		
		 msg=commonDao.saveProduct(prod);
		}

		return msg;
		
	}
	@RequestMapping(value = "sendEmail", method = RequestMethod.POST)

	public ModelAndView sendEmailToClient(HttpServletRequest request) {

		ModelAndView view=new ModelAndView("contact");

		// Reading Email Form Input Parameters      

		String firstname = request.getParameter("firstname");

		String emailMessage = request.getParameter("message");

		String recipient = request.getParameter("emailid");
		//String recipient = "aarthibala2106@gmail.com";

		// email ID of  Sender.
		final String sender = "aarthithirumeni@gmail.com";
		final String password="9043939894";
		// Getting system properties
		Properties props = System.getProperties();

		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
		props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); //SMTP Port

		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(sender, password);
			}
		};

		Session session = Session.getDefaultInstance(props, auth);
		try
		{
			// MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From Field: adding senders email to from field.
			message.setFrom(new InternetAddress(sender));

			// Set To Field: adding recipient's email to from field.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

			// Set Subject: subject of the email
			message.setSubject("Reg:"+firstname+" feedback");

			// set body of the email.
			message.setText(emailMessage);

			// Send email.
			Transport.send(message);
			System.out.println("Mail successfully sent");
		}
		catch (MessagingException mex) 
		{
			mex.printStackTrace();
		}

		return  view;   

	}


}
