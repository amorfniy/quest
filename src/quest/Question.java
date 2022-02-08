package quest;

public class Question {

        private String value;
        private Answer[] answers;
        private int correct;

    public Question(String value, Answer[] answers, int correct) {
        this.value = value;
        this.answers = answers;
        this.correct = correct;
    }
    public String getValue() {
        return value;
    }

    public int getCorrect() {
        return correct;
    }

    public void getAnswers() {
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i].getValue());
        }
    }
}



