import main.*;

public class QuizRunner {
    public static void main (String[] args) {
        Quiz myQuiz = new Quiz();
        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("How many continents are there in the world? \nA: 7 \nB: 3 \nC: 4 \nD: 5" , "A");
        myQuiz.addQuestions(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply.What are the pillars of OOP \nA: Polymorphism \nB: Inheritance \nC: Variable \nD:Encapsulation", "A,B,D");
        myQuiz.addQuestions(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Encapsulation is one of the four pillars of OOP. \n True or False?", "true");
        myQuiz.addQuestions(myTrueFalseQuestion);

        myQuiz.runTheQuiz();

    }
}
