/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author alunolab10
 */
public class Calculadora {
    public static void soma(double a, double b){
        double soma = a + b;
        System.out.println("Soma de " + a + " + " + b + " = " + soma + "\n");
    }
    
    public static void subtracao(double a, double b){
        double sub = a - b;
        System.out.println("Subtração de " + a + " - " + b + " = " + sub + "\n");
    }
     
    public static void multiplicacao(double a, double b){
        double mult = a * b;
        System.out.println("Multiplicação de " + a + " * " + b + " = " + mult + "\n");
    }
    
    public static void divisao(double a, double b){
        double div = a / b;
        System.out.println("Divisão de " + a + " / " + b + " = " + div + "\n");
    }
    
}
