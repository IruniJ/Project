<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		 <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
		<link rel="stylesheet" href="style.css" >
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;300;400;600;700&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet " href="swiper-bundle.min.css">
		
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

		<!--Home Description-->
		<section id="home">
			<h1>Explore the world with us</h1>
			<p>Join hands with us to assist your children to pursue their dreams and explore the world while exploring new pathways and attempting to learn through experimentation.</p>

			<div class="btn">
				<a class="red" href="#">Learn With Us</a>
			</div>
		</section>
		<br>
		<br>



		<!--Subjects-->

		<section id="subjects">

			<h1>Subjects</h1>
			<p>We are doing teaching activities for your children in English medium for the subject of science and developing the child's mind by providing sets of books related to those two subjects and various activities simultaneously.</p>

			<div class="row">
				<div class="subject-col">
					<i class="fa fa-flask"></i>
					<h3>Science</h3>
					<p>All the teaching activities related to the science subject are completed in the relevant term and the subject is also guided on the simultaneous experiment procedures and how it can be used in practical life.</p>
				</div>

				<div class="subject-col">
					<i class="fa fa-calculator"></i>
					<h3>Mathematics</h3>
					<p>All the teaching related to mathematics will be completed in the relevant term and we will work to provide the child with the mathematical environment that makes it necessary to solve the problems related to the subject along with new methods. With this, we would like to open new paths by expanding the logical intellect in the child.</p>
				</div>

			</div>

		</section>



		<!--Grades-->
		<section id="grades">
			<h1>Grades</h1>
			<p>We teach science and mathematics subjects in English to children in the following classes with best experiences.</p>

			<div class="row">
				<div class="grade-col">
					<img src="images/grade-back.jpg">
					<a href="tutorial.html">
						<div class="layer">
							<h2>
								Grade 6
							</h2>
						</div>
					</a>
				</div>

				<div class="grade-col">
					<img src="images/grade-back.jpg">
					<a href="tutorial.html">
						<div class="layer">
							<h2>
								Grade 7
							</h2>
						</div>
					</a>
				</div>

				<div class="grade-col">
					<img src="images/grade-back.jpg">
					<a href="tutorial.html">
						<div class="layer">
							<h2>
								Grade 8
							</h2>
						</div>
					</a>
				</div>

				<div class="grade-col">
					<img src="images/grade-back.jpg">
					<a href="tutorial.html">
						<div class="layer">
							<h2>
								Grade 9
							</h2>
						</div>
					</a>
				</div>
			</div>

		</section>

		<!--Slider-->

	<section>
		<div class="slideshow-container">

			<div class="mySlides fade">
				<div class="numbertext">  1/6   </div>
				<img class="slide" src="images/post/full post 2.jpg">

			</div>

			<div class="mySlides fade">
				<div class="numbertext">  2/6   </div>
				<img class="slide" src="images/post/statement.jpg" style="width:85%">

			</div>

			<div class="mySlides fade">
				<div class="numbertext">  3/6   </div>
				<img class="slide" src="images/post/post-slider - 1.jpg" style="width:80% " height:600px">

			</div>

			<div class="mySlides fade">
				<div class="numbertext">  4/6   </div>
				<img class="slide" src="images/post/register.jpg" style="width:70%">

			</div>

			<div class="mySlides fade">
				<div class="numbertext">  5/6</div>
				<img class="slide" src="images/post/science.jpg">

			</div>

			<div class="mySlides fade">
				<div class="numbertext">  6/6</div>
				<img class="slide" src="images/post/math.jpg">

			</div>


		</div>  <br>

		<div style="text-align:center">
			<span class="dot"></span>
			<span class="dot"></span>
			<span class="dot"></span>
			<span class="dot"></span>
			<span class="dot"></span>
			<span class="dot"></span>
		</div>



		<script>
			let slideIndex = 0;
			showSlides();

			function showSlides() {
				let i;
				let slides = document.getElementsByClassName("mySlides");
				let dots = document.getElementsByClassName("dot");
				for (i = 0; i < slides.length; i++) {
					slides[i].style.display = "none";
				}
				slideIndex++;
				if (slideIndex > slides.length) { slideIndex = 1 }
				for (i = 0; i < dots.length; i++) {
					dots[i].className = dots[i].className.replace(" active", "");
				}
				slides[slideIndex - 1].style.display = "block";
				dots[slideIndex - 1].className += " active";
				setTimeout(showSlides, 3000);
			}

		</script>
		</section>




		 <!--Payment-->

		<section id="payment">
			<div class="pay">
				<h1>The EDUCA - Anuradhapura</h1>
				<p>For your convenience in using our services including registering to our class, attending classes, making payments, call EDUCA for our constant support at the following phone numbers, or visit the FAQ's.</p>
				<p>Support : 0711325731</p>

				<a href="" class="pay-btn">Payment</a>

			</div>

		</section>

		<br>
		<br>


		<!--student comment-->

		<section id="comment">
			<h1>What our student says</h1>
			<p>Those are the feedbacks that the students are provided about Educa</p>

		</section>

		<section id="comment-slider">
			<div class="slide-container swiper">
				<div class="slide-content">
					<div class="card-wrapper swiper-wrapper">


						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s4.jpg" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Shehani Gunasekara</h1>
								<p class="description">EDUCA is committed to the highest standards of educational and other provision for its students, and encourages students to provide the thoughtful and constructive feedback.</p>
								<div class="comment-star">
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>

								<button class="comment-btn">View more</button>
							</div>

						</div>

						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s5.png" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Prarthana Wijesinghe</h1>
								<p class="description">It provides an awesome environment for students to learn freely and actively and it is committed to the highest standards of educational and other provision for its students.</p>
								<div class="comment-star">
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>
								<button class="comment-btn">View more</button>
							</div>

						</div>


						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s6.jpg" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Chamath Kularathne</h1>
								<p class="description">EDUCA is excellent learning environment and encourages students to provide the thoughtful and constructive feedback.</p>
								<br><br>

								<div class="comment-star">
									<i class="fa fa-star-o"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>

								<button class="comment-btn">View more</button>
							</div>

						</div>

						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s1.jpg" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Dushani Pathirana</h1>
								<p class="description">EDUCA is excellent learning environment and encourages students to provide the thoughtful and constructive feedback.<br><br></p>
								<div class="comment-star">
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>
								<button class="comment-btn">View more</button>
							</div>

						</div>

						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s2.jpg" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Avishka Karunarathne</h1>
								<p class="description"> It provides an awesome environment for students to learn freely and actively and it is committed to the highest standards of educational and other provision for its students.</p>
								<div class="comment-star">
									<i class="fa fa-star-o"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>
								<button class="comment-btn">View more</button>
							</div>

						</div>

						<div class="card swiper-slide">
							<div class="image-content">
								<span class="overlay"></span>
								<div class="card-image">
									<img src="images/s3.jpg" alt="" class="card-img">
								</div>
							</div>
							<div class="card-content">
								<h1>Sandaru Jayasinghe</h1>
								<p class="description">EDUCA is committed to the highest standards of educational and other provision for its students, and encourages students to provide the thoughtful and constructive feedback.</p>
								<div class="comment-star">
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>
									<i class="fa fa-star"></i>

								</div>
								<button class="comment-btn">View more</button>
							</div>

						</div>
					</div>
				</div>
				<div class="swiper-button-next swiper-navBtn"></div>
				<div class="swiper-button-prev swiper-navBtn"></div>
				<br>
				<br>
				<div class="swiper-pagination"></div>
			</div>
		</section>



		<!--Contact us-->

		<section class="contact">
			<h1>You can enroll in our classes at your convenience.</h1>
			<a href="contact.php" class="con-btn">Contact Us</a>

		</section>

		<!--footer-->

		<section>
			<footer class="footer">
				<div class="footer-col">
					<h3>Grades</h3>
					<li>Grade 06</li>
					<li>Grade 07</li>
					<li>Grade 08</li>
					<li>Grade 09</li>
				</div>

				<div class="footer-col">
					<h3>Quick Links</h3>
					<li>Student Login</li>
					<li>Student Registration</li>
					<li>Time Table</li>
					<li>Tutorials</li>
				</div>

				<div class="footer-col">
					<h3>Contact</h3>
					<li>0711325731</li>
					<li>0256734598</li>
					<li>educa@gmail.com</li>
					<li>Educa-Anuradhapura</li>

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

		<!--Toggle js-->

		<script>
			const body = document.querySelector("body");
			const nav = document.querySelector(".nav");
			const menuBtn = document.querySelector(".menu-btn");
			const cancelBtn = document.querySelector(".cancel-btn");

			menuBtn.onclick = () => {
				nav.classList.add("show");
				menuBtn.classList.add("hide");
				body.classList.add("disabled");
			}

			cancelBtn.onclick = () => {
				body.classList.remove("disabled");
				nav.classList.remove("show");
				menuBtn.classList.remove("hide");
			}

			window.onscroll = () => {
				this.scrollY > 20 ? nav.classList.add("sticky") : nav.classList.remove("sticky");
			}

		</script>
		<!--Swiper js-->
		<script src="swiper-bundle.min.js"></script>

		<!--Javascript-->
		<script src="script.js"></script>
	</body>
	


		
	

</html>