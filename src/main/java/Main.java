/*
* UCF COP 3330 Fall 2021 Assignment 8 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner party = new Scanner(System.in);
        System.out.println("How many people?");
        int people = party.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = party.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = party.nextInt();

        int total_slices = pizza*slices;
        int leftover = total_slices%people;

        int earning;

        if(leftover==0)
            earning = total_slices/people;

        else
            earning = (total_slices-leftover)/people;


        System.out.printf("%d people with %d pizzas (%d slices)%nEach person gets %d pieces of pizza.%nThere are %d leftover pieces.", people, pizza, total_slices, earning, leftover);
    }
}