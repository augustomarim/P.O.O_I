/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alunolab10
 */
public class ContaBancaria {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);   
    private String titular;
    private double saldo;
    private int numero;
    
    
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
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
}
