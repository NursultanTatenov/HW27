package com.company;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a number to get the square root of a number!");
        System.out.println(sqrt.apply(scan.nextDouble()));
    }
    public static UnaryOperator<Double> sqrt = a -> Math.sqrt(a);
}