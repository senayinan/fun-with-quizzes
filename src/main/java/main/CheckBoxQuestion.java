package main;

public class CheckBoxQuestion extends Question {


    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        String realAnswer = this.getAnswer();
        if (answer.toUpperCase().equals(realAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
