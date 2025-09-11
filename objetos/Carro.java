/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author alunodev10
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;        
    }
    
    public void print(){
        System.out.println("Marca: " + marca +
                        "\nModelo: " + modelo +
                        "\nAno: " + ano +
                        "\nVelocidade: " + velocidade +
                        "\n");
    }
    
    public void acelerar(double velocidade){
        this.velocidade += velocidade;
    }
    
    public void freiar(double velocidade){
        if(this.velocidade >= velocidade){
            this.velocidade -= velocidade;
        }
        else{
            this.velocidade = 0;
        }   
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public static void corrida(Carro a, Carro b, double vA, double vB, double fA, double fB){
        while(a.velocidade < 1000.00 && b.velocidade < 1000){
            a.acelerar(vA);
            b.acelerar(vB);
            a.freiar(fA);
            b.freiar(fB);   
        }
        if(a.velocidade > b.velocidade){
            System.out.println("O vencedor é: " + a.getModelo());
            a.print();
            b.print();
        }
        else if(b.velocidade > a.velocidade){
            System.out.println("O vencedor é: " + b.getModelo());
        }
        else{
            System.out.print("Empate");
        }
    }
    
    
}
