public class Personne {


    public String nom;
    public int age ;
    public boolean estEtudiant ;


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
}

public class Main {


    public static void main (String[] args){

        Personne et1=  new Personne("Harish" , 20,true);
        Personne et2 =new Personne ("javc ",23 ,false );

        et1.afficherInfos();
        et2.afficherInfos();
    }
}