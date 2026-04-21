

//exo 1
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age = 20;
        double moyenne = 15.5;
        String prenom = "jzv";
        boolean etudiant = true;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez l'entier 1 :");
        int a = scanner.nextInt();

        System.out.println("Entrez l'entier 2 :");
        int b = scanner.nextInt();

        int resultat = somme(a, b);

        System.out.println("La somme est : " + resultat);

        scanner.close();
    }

    public static int somme(int a, int b) {
        return a + b;
    }
}

//exo2
 class Personne {


    private String nom;
    private int age ;
    private boolean estEtudiant ;


    Personne(String nom,int age ,boolean estEtudiant){
        this.nom=nom;
        this.age=age;
        this.estEtudiant=estEtudiant;
    }

    public void afficherInfos(){

        System.out.println("nom:"+nom);
          System.out.println("age:"+age);
            System.out.println("estEtudiant:"+estEtudiant);
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
}

public class Main {


    public static void main (String[] args){

        Personne et1=  new Personne("Harish" , 20,true);
        Personne et2 =new Personne ("javc ",23 ,false );

        et1.afficherInfos();
        et2.afficherInfos();
    }
}