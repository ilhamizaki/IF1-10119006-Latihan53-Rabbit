/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class induk Animal
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVagetarian() {
        return false;
    }
    
    public String getEats() {
        return eats;
    }
    
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
