package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        String passSolution = "abc$123";

        System.out.print( "What is the password? " );
        String password = input.next();

        if (password.equals(passSolution)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }

    }
}
