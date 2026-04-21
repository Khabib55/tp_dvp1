<?php
session_start();
?>
<!DOCTYPE html>
<html>
<body>    
<?php
echo"Votre nom est :" . $_SESSION["nom"] . ".<br>";

echo"Votre nom est :" . $_SESSION["prenom"] . ".";

?>
</body>
</html>
