<?php
session_start();
?>
<!DOCTYPE html>
<html>
<body>    
<?php
//set session variables
$_SESSION["nom"]= "ben Farah";
$_SESSION["prenom"]= "Khoubayb";
echo  "Session variables are set.";
?>
</body>
</html>
