package com.pet;

import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {
        System.out.println("What is your pet's name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What do your pet like to do?");
        String action = scanner.nextLine();
        System.out.println("My pet's name is " + name + " and it likes " + action);
    }
}
