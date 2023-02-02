public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // A la naissa.sence
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setName("Koua");
        etudiant1.setPrenom("Wilfried");
        etudiant1.setMatricule("12354");
        etudiant1.setAge(0);

        System.out.println("nom = " + etudiant1.getName());
        System.out.println("prenom = " + etudiant1.getPrenom());
        System.out.println("matricule = " + etudiant1.getMatricule());
        System.out.println("age = " + etudiant1.getAge());

        Ville ville = new Ville();
        Etudiant etudiant2 = new Etudiant(1,"Dion","Fabrice","125487",40,ville);
    }
}