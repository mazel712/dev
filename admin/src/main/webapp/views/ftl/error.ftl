<!DOCTYPE html>
<html lang="zh_CN">
<head>
<base href="/admin/"/>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Title and other stuffs -->
  <title>错误提示页面</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="author" content="">
  <!-- Stylesheets -->
  <link href="style/bootstrap.css" rel="stylesheet">
  <link rel="stylesheet" href="style/font-awesome.css">
  <link href="style/style.css" rel="stylesheet">
  
  <!-- HTML5 Support for IE -->
  <!--[if lt IE 9]>
  <script src="js/html5shim.js"></script>
  <![endif]-->

  <!-- Favicon -->
  <link rel="shortcut icon" href="img/favicon/favicon.png">
</head>

<body>

<!-- Form area -->
<div class="error-page">
  <div class="container">

    <div class="row">
      <div class="col-md-12">
        <!-- Widget starts -->
            <div class="widget">
              <!-- Widget head -->
              <div class="widget-head">
                <i class="icon-question-sign"></i> Error 
              </div>

              <div class="widget-content">
                <div class="padd error">
                  
                  <h1>Opps!!! It's ${code}</h1>
                  <p>Aliquam consequat, purus vitae auctor ullamcorper, sem velit convallis quam, a pharetra justo nunc et mauris. </p>
                  <br />

                                 <form class="form-inline">
									<div class="form-group">
										<input type="text" value="" name="s" id="s" class="form-control"/>
									</div>
                                    <button type="submit" class="btn btn-default">Search</button>
                                 </form>
                                 
                 <br />
                 <div class="horizontal-links">
                  <a href="index.html">Home</a> | <a href="#">About Us</a> | <a href="#">Contact us</a> | <a href="#">FAQ</a>
                 </div>

                </div>
                <div class="widget-foot">
                  <!-- Footer goes here -->
                </div>
              </div>
            </div>  
      </div>
    </div>
  </div> 
</div>
	
		

<!-- JS -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
</body>
</html>