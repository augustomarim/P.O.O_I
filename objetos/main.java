/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class main {
    
            
    public static void main(String[] args) {
        //Exércicio 1//
        
        /*Pessoa pessoa1 = new Pessoa("Augusto", 19, "Vítoria");
        Pessoa pessoa2 = new Pessoa("Geilson", 25, "Vila Velha");
        Pessoa pessoa3 = new Pessoa("Thamily", 20, "Cariacica");
        Pessoa pessoa4 = new Pessoa("Lívia", 20, "Miami");
        pessoa1.print();
        pessoa2.print();
        pessoa3.print();
        pessoa4.setCidade("Vila Velha");
        pessoa4.print()*/

        //Exércicio 2//
        
        /*ContaBancaria conta1 = new ContaBancaria("Heleninha", 10000.00, 123456);
        ContaBancaria conta2 = new ContaBancaria("Odete", 10000000.00, 777777);
        ContaBancaria conta3 = new ContaBancaria("Fatima", 00.00, 123123);
        conta1.print();
        conta2.print();
        conta3.print();
        conta1.sacar(500);
        conta2.transferir(conta3, 500);
        conta1.print();
        conta2.print();
        conta3.print();*/
        
        //Exércicio 3//
        
        /*Produto produto1 = new Produto("Maça", 10.00, 10);
        Produto produto2 = new Produto("Maracuja", 50.00, 15);
        Produto produto3 = new Produto("Mexerica", 100.00, 10);
        produto1.estoque();
        produto2.estoque();
        produto3.estoque();
        Produto[] lista = {produto1, produto2, produto3};
        Produto.estoqueTotal(lista);*/
        
        //Exércicio 4//
        
        /*Carro carro1 = new Carro("Honda", "Hondinha", 2025);
        Carro carro2 = new Carro("Chevrolet", "Chevroletinho", 2007);
        
        carro1.print();
        carro2.print();
        Carro.corrida(carro1, carro2, 50, 30, 0, 20);*/
        
        //Exércicio 5//
        
        /*Aluno aluno1 = new Aluno(); 
        Aluno aluno2 = new Aluno(); 
        Aluno aluno3 = new Aluno(); 
        aluno1.media();
        aluno2.media();
        aluno3.media();*/

        //Exércicio 6//
        
        /*Retangulo retangulo1 = new Retangulo(10, 10);
        Retangulo retangulo2 = new Retangulo(5, 5);
        double a = retangulo1.area();
        double b = retangulo2.area();
        retangulo1.perimetro();
        retangulo2.perimetro();
        Retangulo.maior(a, b);*/
        
        //Exércicio 7//
        
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Jogos Vorazes", "Alguem");
        Livro livro2 = new Livro("Morellonomicon", "Riot Games");
        Livro livro3 = new Livro("Talk that Talk", "Twice");
        
        biblioteca.adicionar(livro1);
        biblioteca.adicionar(livro2);
        biblioteca.adicionar(livro3);

        biblioteca.mostrar();
        
        livro1.emprestar();
        livro2.emprestar();
        livro1.devolver();
        livro3.devolver();

        biblioteca.mostrar();




        
    }


        


        
}

