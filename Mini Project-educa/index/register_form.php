<?php

@include 'config.php';
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

      $error[] = 'user already exist!';

   }else{

      if($pass != $cpass){
         $error[] = 'password not matched!';
      }else{
         $insert = "INSERT INTO user_form(name, email, password, user_type) VALUES('$name','$email','$pass','$user_type')";
         mysqli_query($conn, $insert);
         header('location:login_form.php');
      }
   }

};


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>register-form</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/form.css">
    <link rel="stylesheet" href="style.css">


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
            <h1>Registration Form</h1>

        </section>
      
        <div class="Rform-container">

            <form action="" method="post">
                <h3>Register now</h3>
                <?php
                if(isset($error)){
                foreach($error as $error){
                echo '<span class="error-msg">'.$error.'</span>';
                };
                };
                ?>
                
                <input type="text" name="name" required placeholder="Enter your name">
                <input type="email" name="email" required placeholder="Enter your email">
                <input type="password" name="password" required placeholder="Enter your password">
                <input type="password" name="cpassword" required placeholder="Confirm your password">
                <select name="user_type">
                    <option value="user">User</option>
                    <option value="admin">Admin</option>
                </select>
                <input type="submit" name="submit" value="register now" class="form-btn">
                <p>Already have an account? <a href="login_form.php">login now</a></p>
            </form>

        </div>


    </body>

</html>