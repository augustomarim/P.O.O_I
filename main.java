/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Exercícios IF ELSE
        
        //Exercício 1
        
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
        scanner.nextLine();
        
        //Exercícios WHILE
        
        //Exercício 7
        System.out.println("Digite um número inteiro maior que 0");
        int contador = 0;
        int contagem = scanner.nextInt();
        while(contador < contagem){
            contador += 1;
            System.out.println(contador);
        }
        
        //Exercício 8
        
        System.out.println("Digite números inteiros: ");
        int soma = scanner.nextInt();
        int resultado = 0;
        while(soma > 0){
            resultado += soma;
            soma = scanner.nextInt();
        }
         System.out.println("O resultado desta soma é: " + resultado);
         scanner.nextLine();
    
        //Exercício 9
 
        int sorteio = random.nextInt(100) + 1;
        System.out.print("Digite um número entre 1 e 100: ");
        int tentativa = scanner.nextInt();
        while(sorteio != tentativa){
           if(tentativa > sorteio){
               System.out.println("O número é menor");
           }
           else{
               System.out.println("O número é maior");
           }
           tentativa = scanner.nextInt();
        }
        System.out.println("Parabéns você acertou!");
        scanner.nextLine();
        
        //Exercícios DO WHILE
        
        //Exercicio 10
        
        System.out.print("Digite um número inteiro maior que 0: ");
        int contagem_2 = scanner.nextInt();
        do{
            System.out.println(contagem_2);
            contagem_2 -= 1;  
        }
        while(contagem_2 >= 1);
        scanner.nextLine();    
        
        //Exercicio 11
        
         System.out.print("Digite uma senha: ");
         String senha1 = scanner.nextLine();
         String senha2; 
         do{
             System.out.print("Digite sua senha novamente!: ");
             senha2 = scanner.nextLine();
             if(!senha2.equals(senha1)){
                 System.out.println("Senha incorreta! Tente novamente");
             }
             else{
                 System.out.println("Senha correta!");
             }
         }
         while(!senha2.equals(senha1));
         scanner.nextLine();
        
        //Exercicio 12
        
        int sorteio1 = random.nextInt(100) + 1;
        System.out.print("Digite um número entre 1 e 100: ");
        int tentativa1 = scanner.nextInt();
        do{
             if(tentativa1 > sorteio1){
               System.out.println("O número é menor");
           }
           else{
               System.out.println("O número é maior");
           }
           tentativa1 = scanner.nextInt();
        }
        while(sorteio1 != tentativa1);         
        System.out.println("Parabéns você acertou!");
        scanner.nextLine();
        
        //Exercícios FOR
        
        //Exercicio 13
        
        System.out.print("Digite um número inteiro: ");
        int mult = scanner.nextInt();
        for(int i = 0; i <= mult; i ++){
            int resultado2 = i * mult;
            System.out.println(resultado2);
        }
        scanner.nextLine();
        
        //Exercicio 14
        
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FELIZ ANO NOVO!");
        
        //Exercicio 15
        
        int somaPares = 0;
        for(int i = 2; i <= 100; i += 2){
            System.out.println(i);
            somaPares += i;
        }
        System.out.println("A soma dos numéros pares entre 1 a 100 é: "
        + somaPares);
        
    }
}
