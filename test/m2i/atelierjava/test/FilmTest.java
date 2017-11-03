/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class FilmTest {
    @Test
    public void nouveauFilm(){
        Film f1 = new Film();
        Film f2 = new Film();
        Date d = new Date();
        
        f1.initialise("Dracula", "homme qui devient vampire suite au suicide de sa femme", 1993, d);
        f1.affiche();
        
        f2.initialise("Fast&Furious", "Policier en service qui infiltre un gang de voleurs", 2000 , d);
        f2.affiche();
        
    }
    
        
    
    
}
