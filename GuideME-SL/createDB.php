<?php
$connection = mysqli_connect('localhost','root','');
$sql='CREATE Database GuideME_SL';
$retval=mysql_query($connection,$sql);
if(! $retval){
    die('Could not create the database: ');
}

echo "Database GuideME_SL created successfully\n";
mysqli_close($connection);
?>