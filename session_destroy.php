<?php
session_start();
?>
<!DOCTYPE html>
<html>
    <body>
        <?php
        session_unset();
        session_destroy();
        echo "Sessions détruites"
        ?>
    </body>

</html>