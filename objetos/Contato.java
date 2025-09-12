/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class Contato {
    private String nome;
    private String numero;
    
    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getNumero(){
        return this.numero;
    }
}
