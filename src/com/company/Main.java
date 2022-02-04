package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] str = reader.nextLine().split(" ");
        int n = Integer.parseInt(String.valueOf(str));

        ArrayList<Integer> numbers = new ArrayList<>(n);
        String[] number = reader.nextLine().split(" ");
        for(int i=0; i < numbers.size(); i++) {
            numbers.add(Integer.parseInt(number[i]));
        }

        int hold = 0;

        for(int j = 0; j < numbers.size(); j++) {
            hold = numbers[j + 2];
            numbers[j + 2] = numbers[j];
            numbers[j] = hold;
        }

            System.out.println(numbers);
        }


    }
}
