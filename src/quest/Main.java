package quest;

public class Main {
    public static void main(String[] args) {

        Question[] questions = new Question[5];

        String question1 = "Жене - что у любовницы, любовнице - что у жены, а самому на чердак и...";

        Answer[] answers1  = new Answer[3];
        answers1[0] = new Answer("1 - работать, работать, работать");
        answers1[1] = new Answer("2 - писать, писать, писать");
        answers1[2] = new Answer("3 - стрелять, стрелять, стрелять");

        String question2 = "Кто в Москве не бывал, ...";

        Answer[] answers2  = new Answer[3];
        answers2[0] = new Answer("1 - брррр");
        answers2[1] = new Answer("2 - окшк тмбчк крвт");
        answers2[2] = new Answer("3 - тот красоты не видал");

        String question3 = "Лучшая страна мира?";

        Answer[] answers3  = new Answer[3];
        answers3[0] = new Answer("1 - Палестина");
        answers3[1] = new Answer("2 - Израиль");
        answers3[2] = new Answer("3 - VAI BRAZIL CAMPEAO DO MUNDO");

        String question4 = "Лучший правитель";

        Answer[] answers4  = new Answer[3];
        answers4[0] = new Answer("1 - Великий Лидер Си");
        answers4[1] = new Answer("2 - Великий Отец Мао");
        answers4[2] = new Answer("3 - Рамзан Ахматович");

        String question5 = "За вас, за нас и за...";

        Answer[] answers5  = new Answer[3];
        answers5[0] = new Answer("1 - Донбасс");
        answers5[1] = new Answer("2 - Кавказ");
        answers5[2] = new Answer("3 - Кузбасс");

        questions[0] = new Question(question1, answers1, 1);
        questions[1] = new Question(question2, answers2, 3);
        questions[2] = new Question(question3, answers3, 3);
        questions[3] = new Question(question4, answers4, 2);
        questions[4] = new Question(question5, answers5, 1);
        Game game = new Game(questions);
        game.doPlay();



    }
}
