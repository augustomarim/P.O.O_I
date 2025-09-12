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
public class Biblioteca {
    private List<Livro> livros;
    
    public Biblioteca(){
        livros = new ArrayList<>();
    }
    
    public void adicionar(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado\n");
    }
    
    public void mostrar(){
        for(Livro i: livros){
            System.out.println("Título: " + i.getTitulo() +
                                "\n Autor: " + i.getAutor() +
                                "\n Disponivel: " + i.getDisponivel() +
                                "\n");
        }
    }
}
