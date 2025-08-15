/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author alunodev10
 */
public class Exercicio2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Exercícios IF ELSE
        
        //Exercício 1
        
        /*System.out.println("Insira um número!");
        int numero = scanner.nextInt();
        if(numero %2 == 0){
            System.out.println("Este número é PAR!");
        }
        else{
            System.out.println("Este número é IMPAR!");
        }
        scanner.nextLine();
        
        //Exercício 2
        
        System.out.println("Insira sua idade!");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade!");
        }
        else{
            System.out.println("Você é menor de idade!");
        }
        scanner.nextLine();
        
        //Exercício 3
        
        System.out.println("Insira seu salário!");
        float salario = scanner.nextFloat();
        if(salario <= 1000.00){
            salario *= 1.1;
            System.out.println("Seu salário com bônus de 10%!" + salario);
        }
        else{
            salario *= 1.05;
            System.out.println("Seu salário com bônus de 5%" + salario);
        }
        scanner.nextLine();
        
        //Exercícios SWITCH CASE
        
        //Exercício 4
        
        System.out.println("Digite um número de 1 a 7:");
        int data = scanner.nextInt();
        switch(data){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número não esta no intervalo de 1 a 7");
        }
        scanner.nextLine();
        
        //Exercício 5
        
        System.out.println("Digite um número de 1 a 12:");
        int mes = scanner.nextInt();
        switch(mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número não esta no intervalo de 1 a 12");
        }
        scanner.nextLine();
        
        //Exercício 6
        
        System.out.println("Digite um número de 1 a 3:");
        int codigo = scanner.nextInt();
        double produto = 50.0;
        switch(codigo){
            case 1:
                produto *= 0.95;
                System.out.println("Seu Produto 5% de desconto e custa: " + produto);
                break;
            case 2:
                produto *= 0.90;
                System.out.println("Seu Produto tem 10% de desconto e custa: " + produto);
                break;
            case 3:
                produto *= 0.85;
                System.out.println("Seu Produto 15% de desconto e custa: " + produto);
                break;
            default:
                System.out.println("Número não esta no intervalo de 1 a 3");
        }*/
        
        
        //Exercícios WHILE
        
        //Exercício 7
        System.out.println("Digite um número inteiro maior que 0");
        int contador = 0;
        int contagem = scanner.nextInt();
        while(contador < contagem){
            contador += 1
            System.out.println(contador);
        }
    }   
}
