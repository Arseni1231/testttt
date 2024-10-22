package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int correctAnswer = 0;

            for (int i = 0; i < 5; i++) {
                int number = random.nextInt(10) + 1;
                int number1 = random.nextInt(10) + 1;

                System.out.print(number + " * " + number1 + " = ");
                int myanswer = scanner.nextInt();

                if (myanswer == number * number1) {
                    System.out.println("\u001B[32mПравильно\u001B[0m");
                    correctAnswer++;
                } else {
                    System.out.println("\u001B[31mОшибка\u001B[0m");
                }
            }
            System.out.println("Правильных ответов:" + correctAnswer);
            if (correctAnswer == 5) {
                System.out.println("Molodets!");
            } else if (correctAnswer >= 3) {
                System.out.println("Nado bi eshe pouchitj!");
            } else {
                System.out.println("Srochno nuzhno uchitj tablitsu umnozheniya!!!");
            }
        }
    }
