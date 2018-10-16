<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" type="image/png" sizes="16x16"
	href="../plugins/images/favicon.png">
<title>Billing</title>
<!-- Bootstrap Core CSS -->

<!-- Menu CSS -->

<link
	href="${pageContext.request.contextPath}/style/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/style/css/animate.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/style/css/style.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/style/css/default.css"
	rel="stylesheet">

<style>
.add-item {
	float: right;
	box-shadow: 0 0 0 1px #099E44 inset !important;
	font-size: 15px;
	font-weight: 400;
	padding: 6px 25px;
	text-transform: uppercase;
	margin-right: 0;
	border: 0;
}

.item-price {
	text-align: right;
	float: right;
	margin-left: .25em;
}

.super_number.menu .ui.attached.button {
	padding-right: 6px !important;
	padding-left: 6px !important;
	background: #fff !important;
	color: #099E44 !important;
	box-shadow: 0 0 0 1px #099E44 !important;
	float: left;
	cursor: pointer;
	line-height: 14px;
	height: 25px;
	font-size: 22px;
}

.super_number.menu input {
	position: relative;
	width: 30px;
	margin: 0;
	background: #099E44;
	color: #fff;
	font-size: 14px;
	height: 27px;
	border: 1px solid #099E44;
	float: left;
	top: -1px;
	padding: 0;
	text-align: center;
	border-radius: 0;
}

.orderline {
	border-bottom: 1px solid rgba(120, 130, 140, .13);
	display: table;
	width: 100%;
	padding: 3px 25px;
}

.orderUnits {
	margin-left: 10px ! important;
}

.p-b-5 {
	margin-bottom: 15px;
}
</style>
</head>

<body class="fix-header">
	<!-- ============================================================== -->
	<!-- Preloader -->
	<!-- ============================================================== -->
	<div class="preloader">
		<svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none"
				stroke-width="2" stroke-miterlimit="10" />
        </svg>
	</div>
	<!-- ============================================================== -->
	<!-- Wrapper -->
	<!-- ============================================================== -->
	<div id="wrapper">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<nav class="navbar navbar-default navbar-static-top m-b-0">
			<div class="navbar-header">
				<div class="top-left-part">
					<!-- Logo -->
					<a class="logo" href="index.html"> PA <!-- Logo icon image, you can use font-icon also -->
						<b></a>
				</div>
				<!-- /Logo -->
				<ul class="nav navbar-top-links navbar-right pull-left">
					<li><a href="<%=request.getContextPath()%>/contact">Contact
					</a></li>
				</ul>
				<ul class="nav navbar-top-links navbar-right pull-right">
					<li>
						<form role="search" class="app-search hidden-sm hidden-xs m-r-10">
							<input type="text" placeholder="Search..." class="form-control">
							<a href=""><i class="fa fa-search"></i></a>
						</form>
					</li>
					<li><a class="profile-pic" href="#"> <img
							src="../plugins/images/users/varun.jpg" alt="user-img" width="36"
							class="img-circle"><b class="hidden-xs">Steave</b></a></li>
				</ul>
			</div>
			<!-- /.navbar-header -->
			<!-- /.navbar-top-links -->
			<!-- /.navbar-static-side -->
		</nav>
		<!-- End Top Navigation -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->

		<!-- ============================================================== -->
		<!-- End Left Sidebar -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page Content -->
		<!-- ============================================================== -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row bg-title">
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
						<h4 class="page-title">BILLING</h4>
					</div>
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
						<a href="#" class="newproduct">New Product</a>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->
				<!-- ============================================================== -->
				<!-- Different data widgets -->
				<!-- ============================================================== -->
				<!-- .row -->
				<div class="prodDetail" style="display: none">
					<form id="uploadresForm"
						action="${pageContext.request.contextPath}/Addproduct"
						method="POST" enctype="multipart/form-data">

						<div class="col-lg-12 col-sm-6 col-xs-12">

							<div class="white-box analytics-info">
								<div class="row">
									<div class="col-md-6 col-sm-6 p-b-10">
										<div class="col-md-4 col-sm-6 p-b-5 lab-div">
											<label for="customer">product Name</label>
										</div>
										<div class="col-md-8 col-sm-6 p-b-5 jobPadLftRgt0">
											<input type="text" name="insertproductName"
												id="insertproductName" class="form-control">
										</div>
										<div class="col-md-4 col-sm-6 p-b-5 lab-div">
											<label for="console">Units</label>
										</div>
										<div class="col-md-8 col-sm-6 p-b-5 jobPadLftRgt0">
											<input type="text" name="insertUnits" id="insertUnits"
												class="form-control">
										</div>
									</div>
									<div class="col-md-6 col-sm-6 p-b-10">
										<div class="col-md-4 col-sm-6 p-b-5 lab-div">
											<label for="contact">Quantity</label>
										</div>
										<div class="col-md-8 col-sm-6 p-b-5 jobPadLftRgt0">
											<input type="text" name="insertQuantity" id="insertQuantity"
												class="form-control">
										</div>
										<div class="col-md-4 col-sm-6 p-b-5 lab-div">
											<label for="carrier_bkng">unitprice</label>
										</div>
										<div class="col-md-8 col-sm-6 p-b-5 jobPadLftRgt0">
											<input type="text" name="insertprice" id="insertprice"
												class="form-control">
										</div>
									</div>
									<div class="col-md-6 col-sm-6 p-b-10">
										<div class="col-md-4 col-sm-6 p-b-5 lab-div">
											<label for="contact">Product Image</label>
										</div>
										<div class="col-md-8 col-sm-6 p-b-5 jobPadLftRgt0">
											<input type="file" name="photo" size="50" />
										</div>
									</div>
									<div class="col-md-6 col-sm-6 p-b-10">
										<button value="" name="XL Upload" id="uploadbtn"
											onclick="uploadJqueryForm()" class="btn btn-primary nrmlbtn"
											style="width: 75px !important;">save</button>
									</div>

								</div>
							</div>
						</div>



					</form>
				</div>
				<!--/.row -->
				<!--row -->
				<!-- /.row -->


				<div class="row">
					<!-- .col -->
					<div class="col-md-12 col-lg-7 col-sm-12">
						<div class="white-box">
							<h3 class="box-title">Menu</h3>
							<div class="comment-center p-t-10">
								<c:forEach items="${product}" var="product">
									<div class="comment-body" style="cursor: pointer;">

										<div class="col-md-10 col-m-10" style="padding-left: 0px;">
											<div class="veg tag left" data-icon="?"
												style="position: relative; top: 0px;"></div>
											<div class="header">
												<a><img
													src="data:image/jpg;base64,${product.base64Image}"
													width="100" height="100" /></a><span
													class="productName${product.prodId}">${product.name}</span></br>
												<span class="produnit${product.prodId}">ltr</span>
											</div>
											<div class="description">
												<span class="productprice${product.prodId}">35.00</span>
											</div>
										</div>
										<div class="col-md-2 col-m-2" style="padding-right: 0px;">
											<a id="${product.prodId}"
												class="ui basic green button additem add-item">Add</a>
										</div>
									</div>

								</c:forEach>

							</div>
						</div>
					</div>
					<div class="col-lg-5 col-md-6 col-sm-12">
						<div class="panel">
							<div class="sk-chat-widgets">
								<div class="panel panel-default">
									<div class="panel-heading">Your Order</div>
									<div class="panel-body">
										<ul class="chatonline">


										</ul>
										<Strong class="totalOrder"
											style="display: none; float: right; font-size: medium;">TOTAL:<Strong
											class="totalPrice"></strong></Strong>
									</div>
								</div>

							</div>
						</div>
						<div class="white-box">

							<button value="" name="XL Upload" id="proceedbtn"
								class="btn btn-primary nrmlbtn" style="width: 75px !important;">
								proceed to pay</button>
						</div>

					</div>
					<!-- /.col -->
				</div>
			</div>
			<!-- /.container-fluid -->
			<footer class="footer text-center"> </footer>
		</div>
		<!-- ============================================================== -->
		<!-- End Page Content -->
		<!-- ============================================================== -->
	</div>
	<!-- ============================================================== -->
	<!-- End Wrapper -->
	<!-- ============================================================== -->
	<!-- ============================================================== -->
	<!-- All Jquery -->
	<!-- ============================================================== -->

	<script src="${pageContext.request.contextPath}/style/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/style/js/bootstrap.min.js"></script>
	<!--slimscroll JavaScript -->

	<script
		src="${pageContext.request.contextPath}/style/js/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/style/js/jquery.slimscroll.js"></script>
	<script src="${pageContext.request.contextPath}/style/js/custom.min.js"></script>
	<script src="${pageContext.request.contextPath}/style/js/dashboard1.js"></script>



	<script>
  $('.additem').click(function(){
	  var additem=$(this).attr('id');
	  alert("additem=============="+additem);	  
	  var productName=$(".productName"+additem).text();
	  var productprice=$(".productprice"+additem).text();
	  var productunits=$(".produnit"+additem).text();
	 
 var exist=false;
	$('.orderId').each(function(){
		if ($('.orderId'+additem).attr('id') == additem) {
			exist=true;
		}
	  
	});
	
	if (exist == true) {
		var id=parseInt(additem);
		  var a = parseInt($('.orderquantity'+id).val())+parseInt("1");
		  var b=parseInt(productprice);
		  var price=a*b;
		  var gst=(parseInt(5)*price)/100;
		  var tot=gst+price;
		  $('.orderquantity'+id).val(a);
		  $('.itemprice'+id).text(tot);
	  }else{
		   var gst=(parseInt(5)*parseInt(productprice))/100;
	  var tot=gst+parseInt(productprice);
		  $(".chatonline").append('<li id="'+additem+'" class="orderId orderId'+additem+'"> <div class="details clearfix"><div class="veg tag left" data-icon="?" style="position: relative; top: 0px;"></div><div class="name" style="font-size: 16px; margin-left: 22px; width: auto;">'+productName+'</div></div>'
                                           +' <span class="orderline"><span class="count"><div class="super_number menu" style="margin: 5px 0px 0px 23px;"><span><button id="'+additem+'" unit="'+productprice+'" class="ui left attached button dec"> &minus; </button><input type="text" class="orderquantity'+additem+'" value="1" readonly=""><button id="'+additem+'" unit="'+productprice+'" class="ui right attached button inc"> + </button></span></div></span>Ã— &#8377<span class="pl10 pr5"></span><span class="untiprice'+additem+'">'+productprice+'</span>&nbsp;&nbsp;&nbsp;<span class="orderUnits" style="margin-left: 60px;" >'+productunits+'</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ordergst">5%</span> <span class="itemprice'+additem+' item-price">'+tot+'</span><span class="item-price">&#8377</span> </span>' 
                                           +'</li>');
	  }
	  
	  total();
	  
  });
  
  $(document).on('click', '.inc', function() {
	  var id=parseInt($(this).attr('id'));
		  var a = parseInt($('.orderquantity'+id).val())+parseInt("1");
		  var b=parseInt($(this).attr('unit'));
		  var price=a*b;
		  var gst=(parseInt(5)*price)/100;
		  var tot=gst+price;
		  $('.orderquantity'+id).val(a);
		  $('.itemprice'+id).text(tot);
		   total();
		 
	});
	$(document).on('click', '.dec', function() {
		  var id=parseInt($(this).attr('id'));
		  var a = parseInt($('.orderquantity'+id).val())-parseInt("1");
		  if(a>=1){
		  var b=parseInt($(this).attr('unit'));
		  var price=a*b;
		  var gst=(parseInt(5)*price)/100;
		  var tot=gst+price;
		   $('.orderquantity'+id).val(a);
		  $('.itemprice'+id).text(tot);
		  }
		  total();
		
	});
	$('.newproduct').click(function(){
		$('.prodDetail').show();
		
	});
	
function total(){
	
	 sum=0;
	$(".item-price").each(function() {
  	//alert("")
      //add only if the value is number
      if(!isNaN($(this).text()) && $(this).text().length!=0) {
          sum += parseFloat($(this).text());
      }	        
	});
	$('.totalOrder').show();
	$('.totalPrice').text(sum);
}
function uploadJqueryForm(){

	var oMyForm = new FormData();
	oMyForm.append("file", file2.files[0]);
	$.ajax({
	url: getContextPath() + "/Addproduct",
	data: oMyForm,
	dataType: 'text',
	processData: false,
	contentType: false,
	type: 'POST',
	beforeSend: function () {
	    lockScreen();
	},
	success: function(result){	
	      
	     	
	},
	complete: function () {
	    unlockScreen();
	} 
	});
	}
  </script>

</body>

</html>
