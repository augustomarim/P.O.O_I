/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baratas;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author marci
 */
public class PopulacaoBaratas {
    Random random = new Random();
    int barata = random.nextInt(1000) + 1;
    
    public int aumentarBaratas(float a){
        a /= 100;
        barata *= (1 + a);
        System.out.println("Quantidade de Baratas pós AUMENTO: " + barata);
        return barata;
    }
    
    public int spray(){
        barata *= (1 - 0.1);
        System.out.println("Quantidade de Baratas pós SPRAY: " + barata);
        return barata;
    }
    
    public void getNumeroBaratas(){
        System.out.println("Quantidade de Baratas ATUAIS: " + barata);
    }
}
