package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int correctNumberOfQuestions = 0;
    private Scanner scanner = new Scanner(System.in);

    public Quiz() {
    }

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestions(Question question) {
        this.questions.add(question);

    }
    public void runTheQuiz() {
        for(Question question : questions) {
            System.out.println(question.getQuestion());
            String userAnswer = this.getUserAnswer();
            boolean userAnswerCorrect = question.checkAnswer(userAnswer);
            if(userAnswerCorrect) {
                this.correctNumberOfQuestions ++;
            }
        }
        double percentageOfCorrectAnswers = ((double) this.correctNumberOfQuestions/ (double) this.questions.size()) * 100;
        System.out.println("User's Grade: " + percentageOfCorrectAnswers + "%");

    }
    private String getUserAnswer() {
        String userAnswer = scanner.nextLine();
        return userAnswer;

    }

}
