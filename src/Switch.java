import java.util.Scanner;

public class Switch {


    public static void main(String[] args) throws Exception {

        Ville ville = new Ville();

        System.out.println(" ville === " + ville.getLibelle());

        Etudiant etudiant = new Etudiant();

        System.out.println(" etudiant_ville === " + etudiant.getVille().getLibelle());


        double poids;
        double taille;
        Integer imc = 0;
        int reponse;
        // Scanner scanner = new Scanner(System.in)
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Voulez vous calculer votre IMC? tapez 1 si oui et tapez 2 si non");
            reponse = scanner.nextInt();

            if (reponse == 1) {

                try {
                    //pour le poids
                    System.out.println("Veuillez entrer votre poid en kg ");
                    poids = scanner.nextDouble();
                    System.out.println("votre poids est" + poids + " kg ");

                    //pour la taille
                    System.out.println("Veuillez entrer votre taille en mettre ");
                    taille = scanner.nextDouble();
                    System.out.println("Votre taille est de" + taille + " m ");


                    // ! pour faire le contraire et eviter le else
                    // formule pour calcul
                    double imc1 = (poids / Math.pow(taille, 2));

                    System.out.println("votre imc est de " + imc1);
                    // conditions IMC
                    /*if (imc1 < 18.5) {
                        System.out.println("Poids insuffisant et pouvant occasionner certains risques pour la santé.");
                    } else if (imc1 < 24.9) {
                        System.out.println("Poids santé qui n'augmente pas les risques pour la santé");
                    } else if (imc1 < 29.9) {
                        System.out.println(" Excès de poids pouvant occasionner certains risques pour la santé.");
                    } else {
                        System.out.println(" Obésité, risque accru de développer certaines maladies");
                    }*/



                } catch (Exception e) {

                    System.err.println(e.getMessage());
                    System.err.println(" veuillez saisir un nombre svp ");

                    // pour donner plus de precision sur l'erreur

                    throw new Exception("Veuillez saisir un nombre ");

                }
            }else {
                System.out.println("aurevoir");
            }
        } while(reponse == 1);

    }
}
