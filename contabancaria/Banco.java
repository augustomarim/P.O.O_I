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
 * @author vinic
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
    
    public void deletarConta(){
        System.out.println("Qual conta você deseja excluir");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                contador ++;
                contas.remove(i);
                System.out.println("Conta excluida");
                break;
            }  
        }
        if(contador == 0){
            System.out.println("Conta inexistente");
        }
    }
    
    public void transferencia(){
        System.out.print("\nQual conta vai fazer a transferência: ");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                int ok = contas.get(i).confirmar();
                if(ok == 0){
                   contador ++;
                    System.out.print("\nQual o valor da transferência: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    if(contas.get(i).getSaldo() >= valor){
                        System.out.print("Qual conta vai receber a trasnferência: ");
                        nome = scanner.nextLine();
                        int contadorB = 0;
                        for(int b = 0; b < contas.size(); b++){
                            if(contas.get(b).getTitular().equals(nome)){
                                ok = contas.get(b).confirmar();
                                if(ok == 0){
                                   contadorB++;
                                    contas.get(i).transferencia((contas.get(b)), valor);
                                    System.out.println("\nTransferência efetuada");
                                    break; 
                                }
                                else{
                                    System.out.println("\nCancelando transferência");
                                    break;
                                }
                            }
                        }
                        if(contadorB == 0){
                            System.out.println("\nConta inexistente");
                        }
                        break;
                    }
                    else{
                        System.out.println("\nSaldo insuficiente");
                        break;
                    }            
                }
                else{
                    System.out.println("\nCancelando transferência");
                    break;
                }
            }  
        }
        if(contador == 0){
            System.out.println("\nConta inexistente");
        }
        
    }
    
    public void mostrar(){
        for(ContaBancaria i: contas){
            System.out.println("\nConta " + i.getNumero());
            System.out.println("Títular: " + i.getTitular());
            System.out.println("Banco: " + i.getBanco());
            System.out.println("Agência: " + i.getAgencia());
            System.out.println("Saldo: " + i.getSaldo() + "\n");                       
        }
    }
    
    public void mostrarUm(){
        System.out.print("\nQual conta você deseja ver: ");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                contador ++;
                System.out.println("\nConta " + contas.get(i).getNumero());
                System.out.println("Títular: " + contas.get(i).getTitular());
                System.out.println("Banco: " + contas.get(i).getBanco());
                System.out.println("Agência: " + contas.get(i).getAgencia());
                System.out.println("Saldo: " + contas.get(i).getSaldo() + "\n");
                break;
            }  
        }
        if(contador == 0){
            System.out.println("\nConta inexistente");
        }
    }
    
    public void depositar(){
        System.out.print("\nQual conta você deseja depositar: ");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                int ok = contas.get(i).confirmar();
                if(ok == 0){
                    contador ++;
                    System.out.print("\nQual o valor do deposito: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    contas.get(i).deposito(valor);
                    System.out.println("\nDeposito efetuado");
                    break;  
                }
                else{
                    System.out.println("\nCancelando deposito");
                }
            }  
        }
        if(contador == 0){
            System.out.println("\nConta inexistente");
        }
    }
    
    public void sacar(){
        System.out.print("\nQual conta que você deseja sacar: ");
        String nome = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < contas.size(); i++){
           if(contas.get(i).getTitular().equals(nome)){
                int ok = contas.get(i).confirmar();
                if(ok == 0){
                    contador ++;
                    System.out.print("Qual o valor do saque: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    if(contas.get(i).getSaldo() >= valor){
                       contas.get(i).sacar(valor);
                       System.out.println("\nSaque efetuado");
                       break;
                    }
                    else{
                        System.out.println("\nSaldo insuficiente");
                        break;
                    }     
                }
                else{
                    System.out.println("\nCancelando saque");
                }      
            }  
        }
        if(contador == 0){
            System.out.println("\nConta inexistente");
        }
    }


  
    
    
    
}