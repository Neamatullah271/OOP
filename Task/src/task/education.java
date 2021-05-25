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
public class education {
    String type;
    double fees;
    int joiningage;
    int graduationage;
    String educatorname;
    public education(String t,double f,int j,int g,String e){
        type=t;
        fees=f;
        joiningage=j;
        graduationage=g;
        educatorname=e;
    }
    String getType(){
        return type;
    }
    double getFees(){
        return fees;
    }
    int getJoiningage(){
        return joiningage;
    }
    int getGraduationage(){
        return graduationage;
    }
    String getEducatorname(){
        return educatorname;
    }
    
}
