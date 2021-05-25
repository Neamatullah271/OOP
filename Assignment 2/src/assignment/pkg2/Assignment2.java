/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dogs bulldog=new dogs("Bulldog","light brown" ,"Tony");
        dogs labradour=new dogs("Labradour","Black" ,"Sam");
        dogs poodle=new dogs("Poodle","white" ,"Rocky");
        Cats abyssinian=new Cats("Abyssinian","orange","Lisa");
        Cats siamese=new Cats("Siamese","white","Lucy");
        bulldog.setBirthyear(2017);
        labradour.setBirthyear(2015);
        poodle.setBirthyear(2019);
        abyssinian.setBirthyear(2012);
        siamese.setBirthyear(2020);
        
        System.out.println("                       Mercy Pet Orphanage                           ");
        System.out.println("                Welcome to our Mercy pet orphanage                   ");
        System.out.println("please enter 1 to donate dogs and 2 to donate cats");
        double num=input.nextDouble();
        if(num==1){
            System.out.println("we have  Brown Bulldog Tony age "+bulldog.getAge(bulldog.getBirthyear()));    
            System.out.println("And Black Labradour Sam age "+labradour.getAge(labradour.getBirthyear()));
            System.out.println("And  White Poodle Rocky age "+poodle.getAge(poodle.getBirthyear()));
        }
        else if(num==2){
            System.out.println("we have  White Siamese Lucy age "+siamese.getAge(siamese.getBirthyear()));
            System.out.println("and Orange Abyssinian Liza age "+abyssinian.getAge(abyssinian.getBirthyear()));
        }
        else{System.out.println("Wrong input");}
                }
    
}
