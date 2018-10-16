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
    <link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/favicon.png">
    <title>Billing</title>
    <!-- Bootstrap Core CSS -->
 
    <!-- Menu CSS -->
    
  <link href="${pageContext.request.contextPath}/style/css/bootstrap.min.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/style/css/animate.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/style/css/style.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/style/css/default.css" rel="stylesheet">

<style>
.add-item{
    float: right;
    box-shadow: 0 0 0 1px #099E44 inset!important;
    font-size: 15px;
    font-weight: 400;
    padding: 6px 25px;
    text-transform: uppercase;
    margin-right: 0;
    border: 0;
	}
	.item-price{	
	    text-align: right;
    float: right;
    margin-left: .25em;
	}
	.super_number.menu .ui.attached.button {
	padding-right: 6px!important;
    padding-left: 6px!important;
    background: #fff!important;
    color: #099E44!important;
    box-shadow: 0 0 0 1px #099E44!important;
    float: left;
    cursor: pointer;
    line-height: 14px;
    height: 25px;
    font-size: 22px;
	}
	.super_number.menu input{
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
	.orderline{
	border-bottom: 1px solid rgba(120,130,140,.13);
    display: table;
    width: 100%;
    padding: 3px 25px;
	}
	.orderUnits{
    margin-left: 10px ! important;
	}
	
</style>
</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Preloader -->
    <!-- ============================================================== -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
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
                    <a class="logo" href="index.html"> PA
                        <!-- Logo icon image, you can use font-icon also --><b>
                     </a>
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-left">
				<li><a href="<%=request.getContextPath()%>/contact">Contact </a></li>
				</ul>
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <form role="search" class="app-search hidden-sm hidden-xs m-r-10">
                            <input type="text" placeholder="Search..." class="form-control"> <a href=""><i class="fa fa-search"></i></a> </form>
                    </li>
                    <li>
                        <a class="profile-pic" href="#"> <img src="../plugins/images/users/varun.jpg" alt="user-img" width="36" class="img-circle"><b class="hidden-xs">Steave</b></a>
                    </li>
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
                        <h4 class="page-title">Contact</h4> </div>
                   
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <!-- ============================================================== -->
                <!-- Different data widgets -->
                <!-- ============================================================== -->
                <!-- .row -->
  

            <div class="row">

                <div class="col-xl-8 offset-xl-2 py-5">
     <form id="contact-form" method="post" action="<%=request.getContextPath()%>/sendEmail" role="form">

    <div class="messages"></div>

    <div class="white-box controls">

        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_name">Firstname *</label>
                    <input id="form_name" type="text" name="firstname" class="form-control" placeholder="Please enter your firstname *" required="required" data-error="Firstname is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_lastname">Lastname *</label>
                    <input id="form_lastname" type="text" name="surname" class="form-control" placeholder="Please enter your lastname *" required="required" data-error="Lastname is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_email">Email *</label>
                    <input id="form_email" type="email" name="emailid" class="form-control" placeholder="Please enter your email *" required="required" data-error="Valid email is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_need">Please specify your need *</label>
                    <select id="form_need" name="need" class="form-control" required="required" data-error="Please specify your need.">
                        <option value=""></option>
                        <option value="Request quotation">Request quotation</option>
                        <option value="Request order status">Request order status</option>
                        <option value="Request copy of an invoice">Request copy of an invoice</option>
                        <option value="Other">Other</option>
                    </select>
                    <div class="help-block with-errors"></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label for="form_message">Message *</label>
                    <textarea id="form_message" name="message" class="form-control" placeholder="Message for me *" rows="4" required="required" data-error="Please, leave us a message."></textarea>
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="col-md-12">
                <input type="submit" class="btn btn-success btn-send" value="Send message">
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <p class="text-muted">
                    <strong>*</strong> These fields are required. Contact form template by
                    <a href="https://bootstrapious.com/p/how-to-build-a-working-bootstrap-contact-form" target="_blank">Bootstrapious</a>.</p>
            </div>
        </div>
    </div>

</form>

                </div>

            </div>

      
  
   <script src="${pageContext.request.contextPath}/style/js/jquery.min.js" ></script>
   <script src="${pageContext.request.contextPath}/style/js/bootstrap.min.js" ></script>
    <!--slimscroll JavaScript -->

   <script src="${pageContext.request.contextPath}/style/js/jquery.sparkline.min.js" ></script>
   <script src="${pageContext.request.contextPath}/style/js/jquery.slimscroll.js" ></script>
   <script src="${pageContext.request.contextPath}/style/js/custom.min.js" ></script>
   <script src="${pageContext.request.contextPath}/style/js/dashboard1.js" ></script>

  
  
</body>

</html>
