/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> countries = new HashSet<String>();
        countries.add("Australia");
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Greece");
        
        // Duplicate country
        countries.add("Mexico");
        
        System.out.println(countries);
            
    }
    
}
