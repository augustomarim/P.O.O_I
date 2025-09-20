/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author vinic
 */
public class ContaBancaria {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);   
    private String titular;
    private double saldo;
    private String agencia;
    private String banco;
    private int numero;
    
    
    public ContaBancaria(){
        System.out.print("\nQual o nome do Titular: ");
        String titular = scanner.nextLine();
        this.titular = titular;
        int banco = 0;
        while(banco < 1 || banco > 4){
            System.out.println("Qual o seu Banco: ");
            System.out.println("(1) NUBANK\n" + "(2) SANTANDER\n" + "(3) INTER\n" + "(4) ITAÚ\n");
            banco = scanner.nextInt();
            scanner.nextLine();
            switch(banco){
                case 1: 
                    this.banco = "NUBANK";
                    this.agencia = "0001";
                    break;
                case 2:
                    this.banco = "SANTANDER";
                    this.agencia = "0002";
                    break;
                case 3:
                    this.banco = "INTER";
                    this.agencia = "0003";
                    break;
                case 4: 
                    this.banco = "ITAÚ";
                    this.agencia = "0004";
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente!\n");
            }
        }        
        this.numero = 100000 + random.nextInt(900000);
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getBanco(){
        return banco;
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public void deposito(double saldo){
        this.saldo += saldo;
    }
    
    public void sacar(double saldo){
        this.saldo -= saldo;
    }
    
    public void transferencia(ContaBancaria a, double saldo){
        this.saldo -= saldo;
        a.saldo += saldo;
    }
    
    public int confirmar(){
        System.out.println("\nConta " + this.getNumero());
        System.out.println("Títular: " + this.getTitular());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Saldo: " + this.getSaldo() + "\n");
        while(true){
            System.out.println("Digite 'S' para confirmar e 'N' para cancelar\n");
            String opcao = scanner.nextLine().trim().toUpperCase();
            switch(opcao){
                case "S":
                    return 0;
                case "N":
                    return 1;
                default:
                    System.out.println("Opção inválida, tente novamente\n");
            }
        }
    }
}