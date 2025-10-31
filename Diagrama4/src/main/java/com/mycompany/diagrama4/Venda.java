/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagrama4;
import java.util.Random;

/**
 *
 * @author alunodev10
 */
public class Venda extends Transacao{
    private String dataVenda;
    private Random random = new Random();
    
    public Venda(String descricao, Empregado empregado, Produto produto, String dataVenda){
        id = random.nextInt(99999) + 10000;
        this.descricao = descricao;
        this.empregado = empregado;
        this.produto = produto;
        this.dataVenda = dataVenda;
    }
}
