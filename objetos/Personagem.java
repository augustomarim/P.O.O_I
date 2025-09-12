/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos;

/**
 *
 * @author marci
 */
public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    
    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }
    
    public void atacar(Personagem a){
        a.vida -= forca;
        System.out.println("O personagem " + nome + " deu " + forca +
                           " de dano no Personagem " + a.nome + 
                           " restando " + a.vida + " pontos de vida\n");
    }
    
    public static void luta(Personagem a, Personagem b){
        while(a.vida > 0 && b.vida > 0){
            a.atacar(b);
            if(b.vida <= 0){
                break;
            }
            else{
            b.atacar(a);
            if(a.vida <= 0){
                break;
            }
            }                        
        }
        if(a.vida > 0){
            System.out.println("Personagem " + a.nome + " venceu");
        }
        else{
           System.out.println("Personagem " + b.nome + " venceu"); 
        }
    }
    
}
