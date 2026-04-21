public class Personne {


    public String nom;
    public int age ;
    public boolean estEtudiant ;


    Personne(nom,age ,estEtudiant){
        this.nom=nom;
        this.age=age;
        this.estEtudiant;
    }

    public void afficherInfos(nom,age ,estEtudiant){

        System.out.println("nom:",nom);
          System.out.println("age:",age);
            System.out.println("estEtudiant:",estEtudiant);
    }
}

public class Main {


    public statiic void main (Strings[] args){

        Personne et1=  new Personne(Harish , 20,true);
        Personne et2 =new Personne (javc ,23 ,false );

        et1.afficherInfos;
        et2.afficherInfos;
    }
}