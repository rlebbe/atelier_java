package m2i.atelierjava.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class VehiculeTest {
    
   // @Test
    public void testVehicule(){
        Vehicule vehic1 = new Vehicule("Seat", false, "Bocanegra", "Blanche", 2, 5, 0, 0, 0);
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        
    }
    
//    @Test
    public void testAvion(){
        
        Avion a = new Avion("Boeing", false, "457", "blanc", 200, 800, 0, 0, 200);
        
        a.avancer();
        a.afficher();
       
    }   
    
    @Test
    public void testSousMarin (){
        
   
            SousMarin sm = new SousMarin("lolilol", false, "USS", "Gris", 200, 0, 0, 0, 200, false);
        
        sm.avancer();
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.avancer();
        sm.afficher();
        sm.setMonter(Boolean.TRUE);
        
    }
    
}
