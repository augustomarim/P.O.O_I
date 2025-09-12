/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marci
 */
public class Agenda {
    private List<Contato> contatos;
    
    public Agenda(){
        contatos = new ArrayList<>();
    }
    
    public void adicionar(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado\n");
    }
    
    public void remover(Contato contato){
        contatos.remove(contato);
        System.out.println("Contato removido\n");
    }
    
    public void buscar(String nome){
        for(int i = 0; i < contatos.size(); i++ ){
            Contato c = contatos.get(i);
            if(c.getNome().equals(nome)){
                System.out.println("Nome: " + c.getNome() +
                                   "\nNúmero: " + c.getNumero());
            }
        }
    }
}
