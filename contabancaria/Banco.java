/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alunolab10
 */
public class Banco {
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
}
