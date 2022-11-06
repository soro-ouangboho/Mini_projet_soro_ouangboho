package mon_mini_projet;

public class Employé {
	private final String matricule;
    private final String nom;
    private final int indiceSalarial;

    // Constructeur
    public Employé(String matricule, String nom,  int indiceSalarial) {
        this.matricule = matricule;
        this.nom = nom;
        this.indiceSalarial = indiceSalarial;
    }

    // Methode de calcul des salaires
    public int calculerSalaire(int valeur){
        return valeur*indiceSalarial;
    }



    // Methode de représentation en chaine d'un objet
    @Override
    public String toString() {
        return "Employé{" +
                "nom='" + nom + '\'' +
                ", matricule='" + matricule + '\'' +
                ", indiceSalarial=" + indiceSalarial +
                '}';
    }
}


