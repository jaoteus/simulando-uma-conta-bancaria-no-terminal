package com.example;
import java.util.Scanner;

public class TerminalAccount {
    private static Scanner scan = new Scanner(System.in);
    private static int number;
    private static String agency;
    private static String name;
    private static double balance;
    
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your agency >> ");
        agency = scan.next();
        System.out.print("Enter your agency number >> ");
        number = scan.nextInt();
        System.out.print("Enter your name >> ");
        name = scan.next();
        System.out.print("Enter your balance >> ");
        balance = scan.nextDouble();
        scan.close();

        System.out.printf("Olá, %s! Obrigado por criar uma conta no nosso banco, sua agência é %s, número %d e saldo R$%.2f\n", name, agency, number, balance);
    }
}
