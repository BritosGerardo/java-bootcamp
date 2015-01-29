package com.topic2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scann=new Scanner(System.in);
    	System.out.println("Enter Name:");
    	String sc=scann.next();
        System.out.println( "Hello " + sc +"!");
    }
}
