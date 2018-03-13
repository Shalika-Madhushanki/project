<?php
require "connect.php";
$username= $_POST["username"];
echo "usernameeeeeeeee"+$username;
$password=$_POST["password"];
echo "pswwwwwwwwwwwwwww"+$password;

$sth= "SELECT * FROM users WHERE username = '$username' and password= '$password' ";
$result=mysqli_query($connection,$sth);
if(mysqli_num_rows($result)>0){
	echo "login successful !";
}else{
	echo "login failed !";
}
?> 