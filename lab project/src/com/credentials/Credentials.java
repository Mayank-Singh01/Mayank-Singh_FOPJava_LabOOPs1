package com.credentials;

import java.util.Random;
import java.util.Scanner;

public class Credentials
{
    Scanner sc = new Scanner(System.in);
    long withdrawal;
    long	transfer;
    String OTPgeneration;
    long balance;
    long deposit;
    long amount = 100000;
    int otp;
        //deposit amount
    void Deposit()
    {
        System.out.println("Enter Amount To Deposit: ");
        deposit = sc.nextLong();
        System.out.println("Depositing amount of: "+ deposit+" successful");
    }
    //withdrawal
    void Withdrawal()
    {
        System.out.println("Enter the amount to withdraw: ");
        withdrawal = sc.nextLong();
        System.out.println("Withdraw amount of = "+withdrawal+" successful");
    }
    //transfer
    void Transfer ()
    {
        Random rand = new Random();
        int x = rand.nextInt(99)*99;
        System.out.println("Generated Otp: "+x);
        System.out.println("Enter the otp: ");
        otp = sc.nextInt();
        if (x == otp) {
            System.out.println("Enter the amount to transfer: ");
            transfer = sc.nextLong();
            System.out.println("Transfer of rs" + transfer + " Successful");
        }
        else
    {
        System.out.println("Invalid OTP");
    }
    }
    //logout
    void Logout()
    {
        System.out.println("Thank you for banking with us");
    }
    public void show(){

        System.out.println("Welcome...");
        System.out.println("Select the option: ");
        System.out.println(" ");
        System.out.println("1. Deposit ");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer ");
        System.out.println("4. Logout ");


        do {
            System.out.println("Enter the option");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    Deposit();

                    System.out.println("==================================");
                    break;
                case 2:
                    Withdrawal();

                    System.out.println("==================================");
                    break;
                case 3:
                    Transfer();

                    System.out.println("==================================");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);
        }
    }

