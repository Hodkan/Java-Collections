/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2_5;

/**
 *
 * Ali Albayrak - P304320
 */
public class Course {
    public String code;
    public String name;
    public Course (String a , String b){
        this.code = a;
        this.name = b;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    
    public void display(){
        System.out.println("Code: " + getCode() + "     Name: " + getName()) ;
    }
    
    
}
