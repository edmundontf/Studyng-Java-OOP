/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Banco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1111);
        p1.setDono("Neto");
        p1.abrirConta("CC");
        p1.depositar(250);
        p1.sacar(200);
        p1.estadoAtual();
       
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(650);
        p2.fecharConta();
        p2.estadoAtual();
        

    }
}
