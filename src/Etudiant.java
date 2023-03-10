public class Etudiant {


    private int id;
    private String name;
    private String prenom;
    private String matricule;
    private int age;

    // declaration de ville

    // private Ville ville = new Ville();
    private Ville ville = new Ville();

    public Etudiant() {
        super();
        //this.ville = new Ville();
    }

    public Etudiant(int id, String name, String prenom,
                    String matricule, int age, Ville ville) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.matricule = matricule;
        this.age = age;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }
}