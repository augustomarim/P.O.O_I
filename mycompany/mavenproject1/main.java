/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author alunolab10
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa a1 = new Pessoa();
        Pessoa a2 = new Pessoa();
        Pessoa a3 = new Pessoa();
        Pessoa a4 = new Pessoa();
        Pessoa a5 = new Pessoa();
        a1 = pessoa.cadastro();
        a2 = pessoa.cadastro();
        a3 = pessoa.cadastro();
        a4 = pessoa.cadastro();
        a5 = pessoa.cadastro();
        Pessoa.media(a1.idade, a2.idade, a3.idade, a4.idade, a5.idade);
        Pessoa.maior(a1.idade, a2.idade, a3.idade, a4.idade, a5.idade);
        Pessoa.menor(a1.idade, a2.idade, a3.idade, a4.idade, a5.idade);
        Pessoa.maiorIdade(a1.idade, a2.idade, a3.idade, a4.idade, a5.idade);
        
        
    }
}
