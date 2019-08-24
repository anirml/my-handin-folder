/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Jeppe
 */
public class Animal {

    private int birthYear;
    private String type;
    private String sound;
    
    public Animal() {
    }

    public Animal(int birthYear, String type, String sound) {
        this.birthYear = birthYear;
        this.type = type;
        this.sound = sound;
    }
  
    @Override
    public String toString() {
        return "Animal: " + "(Type = " + type + ".  Year of birth = " + birthYear + ".  Sound = " + sound + ".)";
    } 
}
