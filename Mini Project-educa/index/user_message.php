<?php
include 'contact_form_database.php';



$username=$_POST['username'];
$address=$_POST['address'];
$contact=$_POST['contact'];
$email=$_POST['email'];
$subject=$_POST['subject'];
$message=$_POST['message'];

$sql="INSERT INTO Student_messages(Username,Address, Contact,Email, Subject,  Message) VALUES ('$username','$address','$contact','$email','$subject','$message')";

$result=mysqli_query($conn, $sql);

if($result){
       
    header('Location: ./Contact.php');
}

?>