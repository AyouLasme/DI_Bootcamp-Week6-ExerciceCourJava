public class Ville {
	private int  id ;
	private String libelle ;
	private boolean etat;
	private String[] maires = new String[4];
	
	
	// création d'un constructeur sans parametre
	public Ville() {
		super();
		this.libelle = "Abidjan";
	}

	
	// création d'un constructeur avec parametre
	public Ville(int id, String libelle, boolean etat, String[] maires) {
		this.id = id;
		this.libelle = libelle;
		this.etat = etat;
		this.maires = maires;
	}

	
	// Création des getters et des setters de l'attribut id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	// Création des getters et des setters de l'attribut libelle
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	// Création des getters et des setters de l'attribut etat
	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	// Création des getters et des setters de l'attribut maires
	public String[] getMaires() {
		return maires;
	}

	public void setMaires(String[] maires) {
		this.maires = maires;
	}
}
