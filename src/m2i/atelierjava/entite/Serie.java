/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Serie {
    
    private String titre;
    private String synopsis;
    private int anneeDeSortie;
    private int nombreDeSaison;

    public void initialise(String titre, String synopsis, int nombreDeSaison, int anneeDeSortie) {
        
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeDeSortie = anneeDeSortie;
        this.nombreDeSaison = nombreDeSaison;
        
    }
            
    public void affiche () {
        System.out.println(getTitre() + ", " + getAnneeDeSortie() + ", " + getNombreDeSaison() + ", " + getSynopsis());
    }
    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public int getNombreDeSaison() {
        return nombreDeSaison;
    }

    public void setNombreDeSaison(int nombreDeSaison) {
        this.nombreDeSaison = nombreDeSaison;
    }
    
    
    
    
    
}