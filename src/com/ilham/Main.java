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
 * Deskripsi Program : class Main Animal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rabbit.getName() + "\n"
                           + rabbit.getName() + " is Vegetarian ? " + rabbit.isVagetarian() + "\n"
                           + rabbit.getName() + " eats " + rabbit.getEats() + "\n"
                           + rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs.\n"
                           + rabbit.getName() + " color is " + rabbit.getColor());
    }
  
}
