/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcoes;

/**
 *
 * @author alunodev10
 */
public class Funcoes {
    
    /* Função Exércicio 1 */
    
    public static String lerParImpar(int a){
        if(a % 2 == 0){
            return "Este número é PAR!";
        }
        else{
            return "Este número é IMPAR!";
        }
    }
    
    /* Função Exércicio 2 */
    
    public static String lerIdade(int a){
        if(a >= 18){
            return "Você é MAIOR de idade!";
        }
        else{
            return "Você é MENOR de idade!";
        }
    }
    
    /* Função Exércicio 3 */
    
    public static void lerSalario(float a){
        if(a <= 1000.00){
            a *= 1.1;
            System.out.println("Seu salário com bônus de 10%: " + a);
        }
        else{
            a *= 1.05;
            System.out.println("Seu salário com bônus de 5%: " + a);
        }
    }
    
    /* Função Exércicio 4 */
    
    public static String lerSemana(int a){
        switch(a){
            case 1:
                return "É Segunda-Feira";   
            case 2:
                return "É Terça-Feira";                
            case 3:
                return "É Quarta-Feira";
            case 4:
                return "É Quinta-Feira";   
            case 5:
                return "É Sexta-Feira";    
            case 6:
                return "É Sábado";              
            case 7:
                return "É Domingo";            
            default:
                return "Este número não esta no intervalo de 1 a 7";
        }
    }
    
    /* Função Exércicio 4 */
    
    public static String lerMes(int a){
       switch(a){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Número não esta no intervalo de 1 a 12";
        }
    }
    
    
    
}
