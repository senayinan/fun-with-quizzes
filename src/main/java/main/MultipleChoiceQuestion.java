package main;

public class MultipleChoiceQuestion extends Question {


    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        //Answer will be a string. "A", "B', etc.
        //If user puts "a", "b", etc.We need to make case insensitive.
        String realAnswer = this.getAnswer();
        if (answer.toUpperCase().equals(realAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}

