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
public class Avion extends Vehicule{

    public Avion(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int pas, int x, int y, int z) {
        super(marque, utilitaire, modele, couleur, nbPlaces, pas, x, y, z);
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        this.y = this.y + this.pas/2;
        
    }

    @Override
    public void reculer() {
//        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
