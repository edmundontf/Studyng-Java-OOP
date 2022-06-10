package com.mycompany.aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy", "França", 31, 1.75f,68.9f, 11,2,10);
        l[1] = new Lutador("PutScrip", "Brasil", 30, 1.75f,57.8f, 31,0,11);
        l[2] = new Lutador("André", "venezuela", 29, 1.75f,80.9f, 21,3,12);
        l[3] = new Lutador("Edmundo", "argentina", 40, 1.75f,81.6f, 31,5,13);
        l[4] = new Lutador("Pretty boy", "italia", 31, 1.75f,119.3f, 13,7,12);
        l[5] = new Lutador("Nerdola", "Espanha", 31, 1.75f,105.7f, 13,7,15);

// ---- Teste ---

        Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[4],l[5]);
       UEC01.lutar(l[4],l[5]);

    }
}
















