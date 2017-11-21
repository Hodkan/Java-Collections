/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * Ali Albayrak - P304320
 */
public class Practise2_5 {

   
    
    
    public static void main(String[] args) {
       HashMap<String, Course> courses = new HashMap<String, Course>();
       
       Course course1 = new Course("CIT","Computing and Information Technology");
       Course course2 = new Course("CHI","Childcare and Early Education");
       Course course3 = new Course("MVS","Motor Vehicle Systems");
       Course course4 = new Course("BTH","Beauty Therapy");
       Course course5 = new Course("GDE","Graphic Design");
       
       courses.put(course1.getCode(),course1);
       courses.put(course2.getCode(),course2);
       courses.put(course3.getCode(),course3);
       courses.put(course4.getCode(),course4);
       courses.put(course5.getCode(),course5);
       
       Set<Map.Entry<String,Course>> entries = courses.entrySet();
       for(Map.Entry<String,Course> cours : entries){           
           Course course = cours.getValue();
           course.display();         
       }
       
       
       
      
    }
    
}
