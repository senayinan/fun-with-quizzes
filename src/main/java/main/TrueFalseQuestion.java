package main;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer (String answer) {
        String realAnswer = this.getAnswer();
        if(answer.toUpperCase().equals(realAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }

    }

}
