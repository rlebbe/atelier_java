/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class SousMarin extends Vehicule {
    
    private Boolean monter;

    public Boolean getMonter() {
        return monter;
    }

    public void setMonter(Boolean monter) {
        this.monter = monter;
    }

    public SousMarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int pas, int x, int y, int z, boolean monter) {
        super(marque, utilitaire, modele, couleur, nbPlaces, z, x, y, pas);
                this.monter=monter;
    }

    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
        
        
    }

    @Override
    public void avancer() {
        z = z + pas;
        if (monter){
            this.y = this.y + this.pas ;
        }else{this.y = this.y - this.pas;
        }
    }

    @Override
    public void afficher() {
        super.afficher(); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
