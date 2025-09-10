/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class Produto {
    private String nome;
    private double preco;
    private int qtd;
    
    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public void estoque(){
        double estoque = preco * qtd;
        System.out.println("Nome: " + nome +
                        "\nPreço: " + preco +
                        "\nQuantidade: " + qtd +
                        "\nEstoque Total: " + estoque);
    }
    
    public static void estoqueTotal(Produto[] lista){
        double total = 0;
        for(Produto i : lista){
            total += i.preco * i.qtd;
        }
        System.out.println("Estoque da loja: "+ total);
    }
}
