/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marci
 */
public class main {
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Exercícios IF ELSE
        
        //Exercício 1
        /*
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        String resposta = Exercicio2.lerParImpar(numero);
        System.out.println(resposta);
        scanner.nextLine();
        
        //Exercício 2
        
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        String resposta2 = Exercicio2.lerIdade(idade);
        System.out.println(resposta2);
        scanner.nextLine();
        
        //Exercício 3
        
        System.out.println("Insira seu salário!");
        float salario = scanner.nextFloat();
        Exercicio2.lerSalario(salario);
        scanner.nextLine();
        
        //Exercícios SWITCH CASE
        
        //Exercício 4
       
        System.out.print("Digite um número de 1 a 7: ");
        int data = scanner.nextInt();
        String resposta4 = Exercicio2.lerSemana(data);
        System.out.println(resposta4);
        scanner.nextLine();
    
        
        //Exercício 5
        
        System.out.println("Digite um número de 1 a 12: ");
        int mes = scanner.nextInt();
        String resposta5 = Exercicio2.lerMes(mes);
        System.out.println(resposta5);
        scanner.nextLine();
        
        //Exercício 6
        
        System.out.println("Digite um número de 1 a 3:");
        int codigo = scanner.nextInt();
        Exercicio2.lerDesconto(codigo, 50);
        scanner.nextLine();*/
        
        //Exercícios WHILE
        
        //Exercício 7
        System.out.print("Digite um número inteiro maior que 0: ");
        int contador = 0;
        int contagem = scanner.nextInt();
        Exercicio2.lerInteiro(contador, contagem);
        scanner.nextLine();
        //Exercício 8
        
        System.out.print("Digite números inteiros: ");
        int soma = scanner.nextInt();
        int resultado = 0;
        Exercicio2.lerInteiros(soma, resultado);
        scanner.nextLine();
    
        //Exercício 9
 
        int sorteio = random.nextInt(100) + 1;
        System.out.print("Digite um número entre 1 e 100: ");
        int tentativa = scanner.nextInt();
        Exercicio2.lerTentativa(sorteio, tentativa);
        scanner.nextLine();
        
        //Exercícios DO WHILE
        
        //Exercicio 10
        
        System.out.print("Digite um número inteiro maior que 0: ");
        int contagem_2 = scanner.nextInt();
        Exercicio2.lerInteiroDW(contagem_2);
        scanner.nextLine();    
        
        //Exercicio 11
        
         System.out.print("Digite uma senha: ");
         String senha1 = scanner.nextLine(); 
         Exercicio2.lerSenha(senha1);
         scanner.nextLine();
        
        //Exercicio 12
        
        int sorteio1 = random.nextInt(100) + 1;
        System.out.print("Digite um número entre 1 e 100: ");
        int tentativa1 = scanner.nextInt();
        Exercicio2.lerSorteio(sorteio1, tentativa1);
        scanner.nextLine();
        
        //Exercícios FOR
        
        //Exercicio 13
        
        System.out.print("Digite um número inteiro: ");
        int mult = scanner.nextInt();
        Exercicio2.lerInteiroFOR(mult);
        scanner.nextLine();
        
        //Exercicio 14
        
        Exercicio2.anoNovo();
        
        //Exercicio 15
        
        Exercicio2.lerPares();
        
    }
}
