package com.neurosoft.java;
import java.util.Scanner;
public class Balance {

    public static void main(String[] args) {
        int pw = 1234;
        int totalbalance, deposit, withdraw;
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Your Your total balance");
        totalbalance = Obj.nextInt();
        System.out.println("Your total balance" +totalbalance);

        System.out.println("Enter Your deposit balance");
        deposit= Obj.nextInt();
        System.out.println("Your deposit ="+deposit);
        totalbalance= totalbalance + deposit;
        System.out.println("After deposit your total balance =" +totalbalance);

        System.out.println("Enter Your withdraw balance");
        withdraw= Obj.nextInt();
        System.out.println("Your withdraw ="+withdraw);
        totalbalance= totalbalance - withdraw;
        System.out.println("After withdraw your total balance =" +totalbalance);
        System.out.println("Enter your password");
        int password = Obj.nextInt();
        System.out.println(password);
        if(password==pw)
        {
            System.out.println("You enter right password");

    }
        else{
            System.out.println("You did not enter right password");
        }
}}
