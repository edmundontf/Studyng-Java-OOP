

package com.mycompany.aula09b;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Aula09b {

    public static void main(String[] args) {
       
        Pessoa[] p = new Pessoa[2];
        
        p[0] = new Pessoa("Pedro", 21, "Masculino");
        p[1] = new Pessoa("Maria", 18, "Feminino");
        
        
        Livro[] l = new Livro[3];
        
        l[0] = new Livro("Aprendendo Java OOP", "Guanabara", 300, p[0]);
        l[1] = new Livro("Aprendendo Java Spring Rest", "Algaworks", 800, p[1]);
        l[2] = new Livro("Aprendendo design patterns", "Alura", 200, p[1]);
        
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].fechar();
        
        l[1].abrir();
        l[1].folhear(200);
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].fechar();
        
        
        l[2].abrir();
        l[2].folhear(400);
        l[2].avancarPag();
        l[2].avancarPag();
        l[2].fechar();
        
        System.out.println(l[0].detalhes());
        System.out.println("----------------#########----------------");
        System.out.println(l[1].detalhes());
         System.out.println("----------------#########----------------");
        System.out.println(l[2].detalhes());
    }
}
