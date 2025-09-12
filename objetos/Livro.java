/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
    
    public void emprestar(){
        if(disponivel){
            disponivel = false;
            System.out.println("Livro emprestado\n");
        }
        else{
            System.out.println("Livro não disponivel\n");
        }
    }
    
    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Livro devolvido\n");
        }
        else{
            System.out.println("Livro já disponivel\n");
        }
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public boolean getDisponivel(){
        return disponivel;
    }
    
    
}
