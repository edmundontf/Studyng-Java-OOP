/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author edmundo.faria
 */
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.modelo = "Accurate";
        c2.cor = "Roxa";
        c2.ponta = 0.3f;

        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
