<!DOCTYPE html>
<html>
<head>
    <title>rend</title>
</head>
<body>
    <?php
    
    $somme=0;
    for($i<0;$i<$N;$i++){

        $tab[$i]= rand(1, 20);
        $somme=$somme+$tab[$i];
        echo("$tab[$i] |");
    }
    $moy=$somme/$N;
    echo("<br> la moyenne du tableau est : <font color='red' ><b> $moy</b></font>")
    ?>
    </body>
    </html>

           