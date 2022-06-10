package com.mycompany.aula02;

/* @author edmundo.faria */
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta: " + this.cor);
        System.out.println("Qual o tamanho da ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, retire a tampa");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
       
    }

    void destampar() {
        this.tampada = false;
    }
}
