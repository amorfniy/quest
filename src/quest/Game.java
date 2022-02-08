package quest;


import java.util.Scanner;

public class Game {
    private Question[] questions;
    private int counter;

    public Game( Question[] questions) {
        this.questions = questions;
    }

    void doPlay() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello! Let's play!");
        for(int i  = 0; i < questions.length; i++) {
            System.out.println(questions[i].getValue());
            questions[i].getAnswers();
            System.out.println("Enter the numerical value of the answer");
            int input = Integer.parseInt(reader.nextLine());
            if (input == questions[i].getCorrect()) {
                counter = counter + 1;
                System.out.println("Your answer is correct. Current score is: " + counter);
            }
            else {
                System.out.println("Your answer is incorrect. Current score is: " + counter);
            }
        }
        if (counter >= 4) {
            System.out.println("You passed the game. +5 Social Credit.");
        }
        else {
            System.out.println("You did not pass the game. -303098324 Social Credit. Your execution date is tomorrow.");
        }
        }

}

