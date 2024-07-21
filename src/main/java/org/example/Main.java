package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaTerminal novaConta = new ContaTerminal();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String novoNome = input.nextLine();
        novaConta.setNomeCliente(novoNome);
        System.out.print("Digite a agência:");
        String novaAgencia = input.nextLine();
        novaConta.setAgencia(novaAgencia);
        System.out.print("Digite o número da conta:");
        Integer novoNumero = input.nextInt();
        novaConta.setNumero(novoNumero);
        System.out.print("Digite o saldo inicial:");
        Double novoSaldo = input.nextDouble();
        novaConta.setSaldo(novoSaldo);
        System.out.print("Conta criada com sucesso!");

        System.out.println(novaConta.toString());


    }
}