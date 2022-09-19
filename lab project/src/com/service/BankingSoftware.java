package com.service;

import com.credentials.Credentials;

import java.util.Scanner;

public class BankingSoftware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Credentials c = new Credentials();
        System.out.println("Enter the credentials: ");
        System.out.print("Bank acct no: ");
        long bankAcctNo = sc.nextLong();
        System.out.print("Password: ");
        String password = sc.next();
        if (bankAcctNo == 12345 || password == "mayank123") {
            c.show();
        }
    }
}