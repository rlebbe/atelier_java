/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {
    
    @Test
    public void afficheOK(){
        
        Serie s1 = new Serie();
        s1.initialise("Dexter","Tueur en série" , 2010, 8);
        s1.affiche();
        
        Serie s2 = new Serie();
        s2.initialise("Game of thrones","Bordel dans le royaume", 2012, 7);
        s2.affiche();
        
        
      
        
    }
    
}