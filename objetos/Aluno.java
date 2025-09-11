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
 * @author alunodev10
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
            notas.add(scanner.nextDouble());
        }
    }
}
