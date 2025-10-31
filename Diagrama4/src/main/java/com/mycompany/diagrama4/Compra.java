/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagrama4;
import java.util.*;

/**
 *
 * @author alunodev10
 */
public class Compra extends Transacao {
    private String dataCompra;
    private Random random = new Random();
    
    public Compra(String descricao, Empregado empregado, Produto produto, String dataCompra){
        id = random.nextInt(99999) + 10000;
        this.descricao = descricao;
        this.empregado = empregado;
        this.produto = produto;
        this.dataCompra = dataCompra;
    }
}
