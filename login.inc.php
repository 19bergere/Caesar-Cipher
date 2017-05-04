<?php
session_start();

include '../dbh.php';

$uid = $_POST['uid'];
$pwd = $_POST['pwd'];


$sql = "SELECT * FROM user WHERE uid='$uid' AND BINARY pwd='$pwd'";
$result = $conn-> query($sql);

if(!$row = mysqli_fetch_assoc($result))
{
  echo "Your username or password is incorrect";
}
else{
  $_SESSION['id'] = $row['id'];
  $_SESSION['id'] = $row['uid'];
}

header("Location: ../test.php");
?>
