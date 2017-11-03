/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class Coucou {
    
    
         @Test
    public void coucou123 () {
    
        String a = new String ("123") ;
        String b = new String ("coucou") ;
        String c = new String (a+b);
        String d = new String (b+a);
        System.out.println(c);
        System.out.println(d);
    }
    
}
