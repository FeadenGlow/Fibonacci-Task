package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("По очерёдности в числах Фабоначчи это будет "+calculate(number));
    }

    public static int calculate(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return calculate(number - 1) + calculate(number - 2);
    }
}
