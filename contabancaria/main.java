/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class main {
    static Scanner scanner = new Scanner(System.in);
    static Banco banco = new Banco();
    
    public static void main(String[] args){
        boolean ligado = true ;
        while(ligado){
            System.out.println("\nMenu");
            System.out.println("Digite (0) para sair do programa");
            System.out.println("Digite (1) para criar uma conta");
            System.out.println("Digite (2) para excluir uma conta");
            System.out.println("Digite (3) para fazer um saque");
            System.out.println("Digite (4) para fazer um deposito");
            System.out.println("Digite (5) para fazer uma transferência");
            System.out.println("Digite (6) para mostrar detalhes de uma conta");
            System.out.println("Digite (7) para mostrar todas as contas\n");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 0:
                    System.out.println("Saindo do programa\n");
                    ligado = false;
                    break;
                case 1:
                    ContaBancaria conta = new ContaBancaria();
                    banco.adicionarConta(conta);
                    break;
                case 2:
                    banco.deletarConta();
                    break;
                case 3:
                    banco.sacar();
                    break;
                case 4:
                    banco.depositar();
                    break;
                case 5:
                    banco.transferencia();
                    break;
                case 6:
                    banco.mostrarUm();
                    break;
                case 7:
                    banco.mostrar();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente\n");
            }
        }
    }
}