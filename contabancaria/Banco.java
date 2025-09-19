/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Banco {
    Scanner scanner = new Scanner(System.in); 
    private List<ContaBancaria> contas;
    
    public Banco(){
        contas = new ArrayList<>();
    }
    
    public void adicionarConta(ContaBancaria contaBancaria){
        contas.add(contaBancaria);
    }
    
    public void deletarConta(ContaBancaria contaBancaria){
        contas.remove(contaBancaria);
    }
    
    public void mostrar(){
        for(ContaBancaria i: contas){
            System.out.println("Conta " + i.getNumero());
            System.out.println("\nTítulo: " + i.getTitular());
            System.out.println("\nSaldo: " + i.getSaldo());
            System.out.println("\n --- \n");

                                
        }
    }
    
    public void depositar(){
        System.out.println("Qual Conta você irá depositar: ");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                System.out.print("Qual o valor do deposito:");
                double valor = scanner.nextDouble();
                contas.get(i).deposito(valor); 
                contador ++;
            }  
        }
        if(contador == 0){
            System.out.println("ESSA CONTA NÃO EXISTE LOSER!");
        }
    }
}
