
public class TrueFalse extends Question{
    private final boolean answer;

    protected TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;

    }

    public boolean isAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return getQuestion() + answer;
    }
}
