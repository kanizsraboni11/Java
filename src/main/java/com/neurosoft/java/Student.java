package com.neurosoft.java;

public class Student {
    public static void main(String[] args) {

        int num = 49;

        if (num >= 80 && num <= 90) {
            System.out.println("Your Grade is A");
        }
        else if (num > 49 && num < 60)
        {
            System.out.println("Your Grade is B");
    }
        else if(num >48 && num <50) {
            System.out.println("Your Grade is C");
        }
        else if(num >32 && num <40) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is F");
        }

        }


    }

