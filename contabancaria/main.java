/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class main {
    static Scanner scanner = new Scanner(System.in);
    static Banco banco = new Banco();
    
    public static void main(String[] args) {
      ContaBancaria conta = new ContaBancaria();
      banco.adicionarConta(conta);    
      banco.mostrar();
    }
}
