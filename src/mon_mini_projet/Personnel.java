package mon_mini_projet;

import java.util.ArrayList;

public class Personnel{

    // Methode permetant de calculer Le salaire total des Employés
    public static int CalculDesSalaire(int valeur){
        return calculDuSalaireAVerser(Commerciaux.listDesCommerciaux, Cadre.listDesCades, valeur);
    }


    // Methode calculant le salaire de chaque Employé et renvoi la somme total des salaire
    private static int calculDuSalaireAVerser(ArrayList<Commerciaux> listDesCommerciaux, ArrayList<Cadre> listDesCadres, int valeur){
        int sommeSalaire = 0;
        for (Commerciaux c: listDesCommerciaux) {
            int salaire = c.calculerSalaire(valeur);
            sommeSalaire += salaire;
        }

        for (Cadre cadre: listDesCadres) {
            int salaire = cadre.calculerSalaire(valeur);
            sommeSalaire += salaire;
        }

        return sommeSalaire;

    }

}
