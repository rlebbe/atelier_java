/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SynthetiseurTest {
    
    @Test
    public void testSynthe(){
        
        Synthetiseur st = new Synthetiseur();
        st.allumageOnOff();
       
        st.allumageOnOff();
//        st.jouerNote("do2");
//        st.volumePlus();
//        st.jouerNote("do2");
//        st.volumePlus();
//        st.jouerNote("do2");
//        st.volumePlus();
//        st.jouerNote("do2");
//        st.jouerNote("do2");
//        st.volumeMoins();
        st.jouerNote("do2");
        
        
        
        
    }
        


}