/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author alunolab10
 */
public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa cadastro(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.print("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.print("Digite seu idade: ");
        pessoa.idade = scanner.nextInt();
        return pessoa;      
    }
    
    
    public static void media(int a, int b, int c, int d, int e){
        float soma = a + b + c + d + e;
        int qtd = 5;
        float media = soma / qtd;
        System.out.println("Média das idades: " + media);
    }
    
    public static void maior(int a, int b, int c, int d, int e){
        int[] idades = {a, b, c, d, e};
        int maior = idades[a];
        for(int i = 0; i < 5; i++){
            if(idades[i] > maior){
                maior = idades[i];
            }
        }
        System.out.println("Maior idade: " + maior);       
    }
    
    public static void menor(int a, int b, int c, int d, int e){
        int[] idades = {a, b, c, d, e};
        int menor = idades[a];
        for(int i = 0; i < 5; i++){
            if(idades[i] < menor){
                menor = idades[i];
            }
        }
        System.out.println("Menor idade: " + menor);       
    }
    
    public static void maiorIdade(int a, int b, int c, int d, int e){
        int[] idades = {a, b, c, d, e};
        int qtd = 0;
        for(int i = 0; i < 5; i++){
            if(idades[i] >= 18){
                qtd += 1;
            }
        }
        System.out.println("Quantidades de maiores de idade: " + qtd);       
    }   
}
