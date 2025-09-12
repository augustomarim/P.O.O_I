/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class Retangulo {
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public double area(){
        double area = largura * altura;
        System.out.println("Área: " + area);
        return area;
    }
    
    public double perimetro(){
        double perimetro = 2 * (largura + altura);
        System.out.println("Perímetro: " + perimetro);
        return perimetro;
    }
    
    public static void maior(double a, double b){
        if(a > b){
            System.out.println("O maior retângulo tem " + a + " de área");
        }
        else{
            System.out.println("O maior retângulo tem " + b + " de área");
        }
    }
}
