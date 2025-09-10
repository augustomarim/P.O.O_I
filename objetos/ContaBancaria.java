/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numero;
    
    public ContaBancaria(String titular, double saldo, int numero){
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void depositar(double saldo){
        this.saldo += saldo;
    }
    
    public void sacar(double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
        }
        else{
            System.out.println("SALDO INSUFICIENTE!");
        }
    }
    
    public void print(){
        System.out.println("Titular: " + titular + 
                    "\nSaldo: " + saldo + 
                    "\nNúmero: " + numero);
    }
    
    public void transferir(ContaBancaria destino,double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
        }
        else{
            System.out.println("SALDO INSUFICIENTE!");
        }
    }
}
