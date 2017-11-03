/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class FilmsTest {
    @Test
    public void nouveauFilm(){
        Film f1 = new Film();
        Film f2 = new Film();
        
        f1.setTitre("dracula");
        f2.setTitre("kung fu panda");
        

        
        f1.setAnneeDeProduction(2001);
        f2.setAnneeDeProduction(2010);
        
        System.out.println(f1.getTitre() + ", " + f1.getAnneDeProduction());
        System.out.println(f2.getTitre() + ", " + f2.getAnneDeProduction());
        
       
    }
    
}
