/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

import java.util.Scanner;

/**
 *
 * @author alunodev10
 */
public class Exercicio {

    public static void main(String[] args) {
         //EXERCÍCIO 1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o 1° valor: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Digite o 2° valor: ");
        float numero2 = scanner.nextFloat();
        System.out.println("Digite o 3° valor: ");
        float numero3 = scanner.nextFloat();
        float soma = numero1 + numero2 + numero3;
        float media = soma / 3;
        System.out.printf("Sua média é: %.2f\n", media);
        scanner.close();*/
        
        //EXERCÍCIO 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em graus Celsiusº: ");
        float celsius = scanner.nextFloat();
        float fahreinheit = ((celsius * 9)/5) + 32;
        System.out.printf("O valor em Fahrenheit é %.2f°\n", fahreinheit);
        scanner.close();*/
                
        //EXERCÍCIO 3
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.printf("Seu nome é: %s %s\n", nome, sobrenome);
        scanner.close();*/
        
        //EXERCÍCIO 4
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int tamanho = frase.length();
        System.out.printf("Sua frase contém %d digitos\n", tamanho);
        scanner.close();*/
        
        //EXERCÍCIO 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio de um círculo: ");
        float raio = scanner.nextFloat();
        double area = Math.PI * raio * raio;
        System.out.printf("O valor da área é %.2f\n", area);
        scanner.close();
    }
}
