<!DOCTYPE html>
<html>
<head>
    <title>title</title>
</head>
<body>
    <?php
var_dump($_POST);
     $a=$_POST['v1'];
     $b=$_POST['v2'];
     $op=$_POST['op'];
     switch ($op){
        case 'sum':
            $operation ="+";
            $r =$a+$b;
            break;
        case 'mul':
            $operation ="*";
            $r =$a*$b;
            break;
        case 'sub':
            $operation ="-";
            $r =$a-$b;
            break;
        case 'div':
            $operation ="/";
            
            if($b==0){
                echo"erreur , change valeur2";
            exit;
            }else{
                $r =$a/$b;
            }
            
        }
     
     
     echo"<h1>$a $operation $b = $r</h1>"
    ?>
    <a href="felicitation.php">felicitation </a>
    </body>
    </html>
    

    