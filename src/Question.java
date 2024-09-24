public abstract class Question {
    private final String question;
    public String userAnswer;


    protected Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

}

