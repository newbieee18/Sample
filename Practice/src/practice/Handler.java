/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author JEC
 */
public class Handler {
    
    private String givenName, surName, middleName;
    private int age;
    
    public Handler(String givenName, String surName, String middleName, int age){
        
        this.setGivenName(givenName);
        this.setSurName(surName);
        this.setMiddleName(middleName);
        this.setAge(age);
        
    }
    
    public String getGivenName(){
        return givenName;
    }
    
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    
    public String getSurName(){
        return surName;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        
        if(age == 22){
            this.age = age;
            this.givenName = "Gwapo";
        }
        else{
            this.age = age;
            this.givenName = "Hindi Gwapo";
        }
    }
    
    
    
}
