package com.mycompany.aula03;

/**
 *
 * @author edmundo.faria
 */
public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Crystal", "Red", 0.5f, 100, false);
        
        c1.status();
        System.out.println("-------------------------------");
        Caneta c2 = new Caneta ("Hexagonal", "Verde", (float)0.5, 100, true);
        c2.status();

    }
}
