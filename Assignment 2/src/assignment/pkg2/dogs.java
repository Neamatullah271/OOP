/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Date;

/**
 *
 * @author HP
 */
public class dogs {
    
    String type;
     private int birthyear;
    int age;
    String color;
    String name;
    public dogs(String type,String color,String name){
        type=type;
        color=color;
        name=name;
    }
    public dogs(){}
    public void setBirthyear(int birthyear){
        this.birthyear=birthyear;
    }
    Date d=new Date();
    int year=d.getYear()+1900;
     
    String getType(){
        return type;
    }
    int getAge(int birthyear){
        return year-birthyear ;
    }
    String getColor(){
        return color;
    }
    String getName(){
        return name;
    }
    
    int getBirthyear(){
        return birthyear;
    }
    
}
