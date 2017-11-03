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
public class Film {
    
    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;
    
    
    
    public void setTitre(String titre) {
        this.titre = titre ;
    }
    
    public String getTitre(){
        return titre ;
    
    }
    
    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction ;
    }
        
    public int getAnneDeProduction() {
        return anneeDeProduction ;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    public void initialise(String titre, String synopsis, int anneeDeProduction, Date dateCreation) {
        
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeDeProduction = anneeDeProduction;
        this.dateCreation = dateCreation;
    
}
    public void affiche () {
        System.out.println(titre + ", " + anneeDeProduction+ ", " + dateCreation+ ", " + synopsis);
//egal a: System.out.println(" String.format("Film: %s %s %d %s %s", this.titre, this.synopsis, this.anneeDeProduction...);

    }
}