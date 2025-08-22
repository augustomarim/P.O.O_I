/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcoes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alunodev10
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Exercícios IF ELSE
        
        //Exercício 1
        
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        String resposta = Funcoes.lerParImpar(numero);
        System.out.println(resposta);
        scanner.nextLine();
        
        //Exercício 2
        
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        String resposta2 = Funcoes.lerIdade(idade);
        System.out.println(resposta2);
        scanner.nextLine();
        
        //Exercício 3
        
        System.out.println("Insira seu salário!");
        float salario = scanner.nextFloat();
        Funcoes.lerSalario(salario);
        scanner.nextLine();
        
        //Exercícios SWITCH CASE
        
        //Exercício 4
  
        System.out.print("Digite um número de 1 a 7: ");
        int data = scanner.nextInt();
        String resposta4 = Funcoes.lerSemana(data);
        System.out.println(resposta4);
        scanner.nextLine();
        
        //Exercício 5
        
        System.out.println("Digite um número de 1 a 12:");
        int mes = scanner.nextInt();
    }
}
