package me.flo456123;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int choice = new Random().nextInt(2);
        if (choice == 0) {
            System.out.println("Burrito");
        }
        else {
            System.out.println("Burrito bowl");
        }
    }
}