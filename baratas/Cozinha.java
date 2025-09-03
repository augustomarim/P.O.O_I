/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baratas;

/**
 *
 * @author marci
 */
public class Cozinha {
    PopulacaoBaratas barata = new PopulacaoBaratas();
    
    public void simulacao(){
        barata.getNumeroBaratas();
        barata.aumentarBaratas(20);
        barata.spray();
        barata.getNumeroBaratas();
    }
    
}
