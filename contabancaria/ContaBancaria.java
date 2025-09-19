/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author augus
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
        System.out.print("Qual o nome do Titular: ");
        String titular = scanner.nextLine();
        this.titular = titular;
        System.out.println("Qual o seu Banco: ");
        System.out.println("(1) NUBANK\n" + "(2) SANTANDER\n" + "(3) INTER\n" + "(4) ITAÚ");
        int banco = scanner.nextInt();
        while(banco < 1 || banco > 4){
            switch(banco){
                case 1: 
                    this.banco = "NUBANK";
                    break;
                case 2:
                    this.banco = "SANTANDER";
                    break;
                case 3:
                    this.banco = "INTER";
                    break;
                case 4: 
                    this.banco = "ITAÚ";
                    break;
                default:
                    System.out.println("Opção incorreta, tente novamente!");
            }
        }
        scanner.nextLine();
        this.agencia = "0001";        
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
    
    public void deposito(double saldo){
        this.saldo += saldo;
    }
}