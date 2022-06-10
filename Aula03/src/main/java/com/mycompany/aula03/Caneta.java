package com.mycompany.aula03;

/* @author edmundo.faria */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public  Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
     
    
   public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
        
        
    }
    
    
    
    public void status(){
      System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("O tamanho da ponta é: " + this.ponta);
        System.out.println(" A cor da caneta é: " + this.cor);
        System.out.println("A caneta esta em: " + this.carga+ "%");
        System.out.println("Ela está tampada? " + this.tampada);
    }
}
