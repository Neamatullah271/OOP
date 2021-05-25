/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 *
 * @author HP
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        education school=new education("High School",2000,15,17,"teacher");
        education university=new education("college",12000,18,22,"proffesor");
        System.out.println(university.getEducatorname());
        
    }
    
}
