/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagrama4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alunodev10
 */
public class Empregado {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int id;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String cpf;
    private String rg;
    
    public Empregado(){
        id = 10000 + random.nextInt(90000);
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu endereço: ");
        endereco = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu bairro: ");
        bairro = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu cidade: ");
        cidade = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu uf: ");
        uf = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu cep: ");
        cep  = scanner.nextLine();
        System.out.print("Digite seu telefone: ");
        telefone = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu cpf: ");
        cpf  = scanner.nextLine();
        System.out.println("");
        System.out.print("Digite seu rg: ");
        rg = scanner.nextLine();
    }
    
    public void editar(){
        while(true){
            System.out.println("Oque deseja editar?");
            System.out.println("NOME[1]");
            System.out.println("ENDEREÇO[2]");
            System.out.println("BAIRRO[3]");
            System.out.println("CIDADE[4]");
            System.out.println("UF[5]");
            System.out.println("CEP[6]");
            System.out.println("TELEFONE[7]");
            System.out.println("CPF[8]");
            System.out.println("RG[9]");
            System.out.print("Opção: " + "\n");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Digite o novo nome: ");
                    nome = scanner.nextLine();
                    setNome(nome);
                    break;
                case 2:
                    System.out.print("Digite o novo endereço: ");
                    endereco = scanner.nextLine();
                    setEndereco(endereco);
                    break;
                case 3:
                    System.out.print("Digite o novo bairro: ");
                    bairro = scanner.nextLine();
                    setBairro(bairro);
                    break;
                case 4:
                    System.out.print("Digite o novo cidade: ");
                    cidade = scanner.nextLine();
                    setCidade(cidade);
                    break;
                case 5:
                    System.out.print("Digite o novo uf: ");
                    uf = scanner.nextLine();
                    setUf(uf);
                    break;
                case 6:
                    System.out.print("Digite o novo cep: ");
                    cep = scanner.nextLine();
                    setCep(cep);
                    break;
                case 7:
                    System.out.print("Digite o novo telefone: ");
                    telefone = scanner.nextLine();
                    setTelefone(telefone);
                    break;
                case 8:
                    System.out.print("Digite o novo cpf: ");
                    cpf = scanner.nextLine();
                    setCpf(cpf);
                    break;
                case 9:
                    System.out.print("Digite o novo rg: ");
                    rg = scanner.nextLine();
                    setRg(rg);
                    break;
                default:
                    System.out.println("Opção não existente");
                    break;
            }
            break;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
