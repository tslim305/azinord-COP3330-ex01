package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("What is your name?");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}

