package mon_mini_projet;

import java.util.ArrayList;

public class Commerciaux extends Employé{


    // Liste des commerciaux
    static ArrayList<Commerciaux> listDesCommerciaux = new ArrayList<>();

    int valeur = 0;
    int vente = 0;
    float taux;

    // Constructeur
    public Commerciaux(String matricule, String nom, int indiceSalarial, float taux) {
        super(matricule, nom, indiceSalarial);
        this.taux = taux;
    }

    // Methode enregistrant un Cimmerciaux
    public static void EnregistrerComerciaux(Commerciaux commerciaux){
        listDesCommerciaux.add(commerciaux);
    }

    // Setteurs permettant de mettre à jour la vente
    public void mettreAJourLaVente(int vente){
        this.vente = vente;
    }

    // Redefinission de la methode de calcul des salaires
    @Override
    public int calculerSalaire(int valeur) {
        this.valeur = valeur;
        return (int) (super.calculerSalaire(valeur) + vente*taux);
    }

}


