package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random ran = new Random();
        int card1 = ran.nextInt((11) + 1);
        int card2 = ran.nextInt((11) + 1);
        ArrayList<Integer> cards = new ArrayList<Integer>();
        cards.add(card1);
        cards.add(card2);
        System.out.println(cards);
        Scanner input = new Scanner(System.in);
        System.out.println("1 = hit or 2 = stick");
        int choice = input.nextInt();
        while (choice != 2) {
            cards.add(ran.nextInt((11) + 1));
            System.out.println(cards);
            System.out.println("1 = hit or 2 = stick");
            choice = input.nextInt();
        }
        int dcard1 = ran.nextInt((11) + 1);
        int dcard2 = ran.nextInt((11) + 1);
        ArrayList<Integer> dcards = new ArrayList<Integer>();
        dcards.add(dcard1);
        dcards.add(dcard2);
        if (dcard1 + dcard2 <= 15) {
            System.out.println(dcard1);
            System.out.println(dcard2);
            System.out.println("dealers draws");
            dcards.add(ran.nextInt((11) + 1));
        } else {
            System.out.println(dcard1);
            System.out.println(dcard2);
            System.out.println("dealer sticks");
        }
        for (int i = 0; i < cards.size(); i++){
            int num = cards.get(i);
            int total =

        }
    }
}
