<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="style.css" >
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;300;400;600;700&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
			<h1>Contact Us</h1>

		</section>

		<!--Contact us-->

		<section class="location">
			<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3348.630516101539!2d80.44820161507901!3d8.306129703958215!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3afc8b523263348b%3A0xd412d200e01c2b0e!2sKeerikkulama!5e1!3m2!1sen!2slk!4v1664125392493!5m2!1sen!2slk" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>

		</section>


		<section class="contact-us">
			<h1>Get in touch with us</h1>
			<div class="row">
				<div class="contact-col">

					<div>
						<i class="fa fa-home"></i>
						<span>
							<h4>Location</h4>
							<p>No.540, Galkulama Road, Anuradhapura</p>
						</span>
					</div>

					<div>
						<i class="fa fa-phone"></i>
						<span>
							<h4>Support</h4>
							<p>0711325731</p>
						</span>
					</div>

					<div>
						<i class="fa fa-envelope-o"></i>
						<span>
							<h4>Email Us</h4>
							<p>educa@gmail.com</p>
						</span>
					</div>

					<div>

						<span>
							<h4>Follow us</h4>
							<div class="icons">
								<a href="#"><i class="fa fa-facebook-official"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-instagram"></i></a>
								<a href="#"><i class="fa fa-linkedin"></i></a>
						</span>
					</div>

				</div>
			</div>

			<div class="contact-col">


				<h1>      Send Us A Message       </h1>


				<form action="user_message.php" method="POST" autocomplete="off">
					<div class="user my-4">

						<input type="text" name="username" placeholder="Enter Your Name" id="username" class="form-control" required>
					</div>
					<div class="email my-4">

						<input type="text" name="address" placeholder="Enter Your Address" id="address" class="form-control" required>
					</div>
					<div class="email my-4">

						<input type="text" name="contact" placeholder="Enter Your Contact Number" id="contact" class="form-control" required>
					</div>
					<div class="email my-4">

						<input type="email" name="email" placeholder="Enter Your Email Address" id="email" class="form-control" required>
					</div>
					<div class="subject my-4">

						<input type="text" name="subject" placeholder="Enter Your Subject" id="subject" class="form-control" required>
					</div>

					<div class="message my-4">

						<textarea name="message" placeholder="Enter Message Here..." id="message" rows="5" class="form-control" required></textarea>
					</div>
					<button type="submit" class="sendbtn">  Send Message    </button>
				</form>



			</div>
			</div>


		</section>
		<!--Cancel and Menu button js-->
		<script>
			const body = document.querySelector("body");
			const navbar = document.querySelector(".navbar");
			const menuBtn = document.querySelector(".menu-btn");
			const cancelBtn = document.querySelector(".cancel-btn");

			menuBtn.onclick = () => {
				navbar.classList.add("show");
				menuBtn.classList.add("hide");
				body.classList.add("disabled");
			}

			cancelBtn.onclick = () => {
				body.classList.remove("disabled");
				navbar.classList.remove("show");
				menuBtn.classList.remove("hide");
			}

			window.onscroll = () => {
				this.scrollY > 20 ? navbar.classList.add("sticky") : navbar.classList.remove("sticky");
			}

		</script>
		<!--footer-->

		<section>
			<footer class="footer">
				<div class="footer-col">
					<h3>Grades</h3>
					<li><a href="tutorial.html">Grade 06</a></</li>
					<li><a href="tutorial.html">Grade 07</a></</li>
					<li><a href="tutorial.html">Grade 08</a></</li>
					<li><a href="tutorial.html">Grade 09</a></</li>
				</div>

				<div class="footer-col">
					<h3>Quick Links</h3>
					<li><a href="login_form.php.php">Student Login</a></li>
					<li><a href="register_form.php">Student Registration</a></li>
					<li><a href="time table.html">Time Table</a></li>
					<li><a href="tutorial.html">Tutorials</a></li>
				</div>

				<div class="footer-col">
					<h3>Contact</h3>
					<li>0711325731</li>
					<li>0256734598</li>
					<li><a href="mailto:educa@gmail.com">educa@gmail.com</a></li>
					<li><a href="contact.html">Educa-Anuradhapura</a></li>

				</div>

				<div class="footer-col">
					<h3>News Letter</h3>
					<p>Enter your email address or phone number <br>to get the latest information.</p>
					<br>
					<div class="subscribe">
						<input type="text" placeholder="Enter your Email address" id="footer-suscribe-text">
						<input type="submit" value="SUBSCRIBE" id="footer-subscribe-btn">

					</div>
				</div>

				<div class="copyright">
					<p>Copyright &copy;2022 All Rights Reserved by <a href="index page.html">Educa </p>
					<div class="icons">
						<a href="#"><i class="fa fa-facebook-official"></i></a>
						<a href="#"><i class="fa fa-twitter"></i></a>
						<a href="#"><i class="fa fa-instagram"></i></a>
						<a href="#"><i class="fa fa-linkedin"></i></a>

					</div>
				</div>

			</footer>


		</section>





	</body>

</html>