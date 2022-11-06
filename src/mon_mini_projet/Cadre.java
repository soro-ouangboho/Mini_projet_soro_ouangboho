package mon_mini_projet;

import java.util.*;

public class Cadre extends Employé{

    static ArrayList<Cadre> listDesCades = new ArrayList<>(); // List qui va stocker Les cadre
    // Déclaration d'un HashMap qui contiendra
    private static HashMap<Cadre, ArrayList<Employé>> listeDesSubalternesEtDeleursCadres = new HashMap<>();

    // Constructeur
    public Cadre(String matricule, String nom, int indiceSalarial) {
        super(matricule, nom, indiceSalarial);
    }

    // Methode permettant d'enregistrer un cadre
    public static void enregistrerCadre(Cadre cadre){
        listDesCades.add(cadre);
    }

    // Methode permettant d'enregistrer les subalternes direct d'un cadre
    public static void EnregistrerSubalternes(Cadre cadre, Employé employé){
        if (listeDesSubalternesEtDeleursCadres.containsKey(cadre)){
            listeDesSubalternesEtDeleursCadres.get(cadre).add(employé);
        }else {
            listeDesSubalternesEtDeleursCadres.putIfAbsent(cadre, new ArrayList<>());
            listeDesSubalternesEtDeleursCadres.get(cadre).add(employé);

        }
    }

    // Methode permettant d'afficher les cadres et leurs subalternes
    public static void afficherSubAlternes(){
        Iterator iterator = listeDesSubalternesEtDeleursCadres.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapentry = (Map.Entry) iterator.next();
            System.out.println("Cadre: "+mapentry.getKey() + " ---> Subalternes: "+mapentry.getValue());
        }
    }

}



