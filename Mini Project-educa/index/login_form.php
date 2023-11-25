<?php

@include 'config.php';

session_start();
error_reporting(0);

if(isset($_POST['submit'])){

   $name = mysqli_real_escape_string($conn, $_POST['name']);
   $email = mysqli_real_escape_string($conn, $_POST['email']);
   $pass = md5($_POST['password']);
   $cpass = md5($_POST['cpassword']);
   $user_type = $_POST['user_type'];

   $select = " SELECT * FROM user_form WHERE email = '$email' && password = '$pass' ";

   $result = mysqli_query($conn, $select);

   if(mysqli_num_rows($result) > 0){

      $row = mysqli_fetch_array($result);

      if($row['user_type'] == 'admin'){

         $_SESSION['admin_name'] = $row['name'];
         header('location:page_logout.php');

      }elseif($row['user_type'] == 'user'){

         $_SESSION['user_name'] = $row['name'];
         header('location:page_logout.php');

      }

   }else{
      $error[] = 'incorrect email or password!';
   }

};
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login form</title>

    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/form.css">

</head>
<body>

    <!--Header-->
   <nav class="navbar">
			<div class="content">
				<div class="logo">
					<a href="#"><img src="images/logo.png" alt=""></a>
				</div>


				<ul class="menu-list">
					<div class="icon cancel-btn">
						<i class="fas fa-times"></i>


					</div>

					<li><a href="index page.php">HOME</a></li>
					<li><a href="About.html">ABOUT</a></li>
					<li><a href="Contact.php">CONTACT</a></li>
					<li><a href="Tutorial.html">TUTORIALS</a></li>
					<li><a href="Time table.html">TIME TABLE</a></li>
					<li><a href="faq.html">FAQ</a></li>

					<div class="form-page-btn">

						<a class="form-btn" href="login_form.php" class="btn">Login</a>
						<a class="form-btn" href="register_form.php" class="btn">Register</a>

					</div>


				</ul>

				<div class="icon menu-btn">
					<i class="fas fa-bars"></i>
				</div>
			</div>
		</nav>



    <section id="about-home">
        <h1>Login Form</h1>

    </section>

    <div class="Lform-container">

        <form action="" method="post">
            <h3>login now</h3>
            <?php
            if(isset($error)){
            foreach($error as $error){
            echo '<span class="error-msg">'.$error.'</span>';
            };
            };
            ?>
            <input type="email" name="email" required placeholder="enter your email">
            <input type="password" name="password" required placeholder="enter your password">
            <input type="submit" name="submit" value="login now" class="form-btn">
            <p>don't have an account? <a href="register_form.php">register now</a></p>
        </form>

    </div>

</body>
</html>