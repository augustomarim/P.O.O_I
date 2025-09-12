/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marci
 */
public class Aluno {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private List<Double> notas;
    
    public Aluno(){
        notas = new ArrayList<>();
        System.out.print("Nome do Aluno: ");
        nome = scanner.nextLine();
        while(notas.size() < 2){
            System.out.print("Notas do Aluno: ");
            double nota = scanner.nextDouble();
            if(nota <= 10 && nota >= 0){
                notas.add(nota);
            }
            else{
                System.out.println("Nota invalida!");
            }
            
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void media(){
        double soma = 0;
        for(double i : notas){
            soma += i;
        }
        double media = soma / notas.size();
        System.out.println("Media do Aluno " + nome + " é: " +  media);
        if(media >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
    
    
    
    
    
    
    
}
