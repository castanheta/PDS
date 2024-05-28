package BehavioralPatterns.ex2;

public class AddOperation implements Operation {
    @Override
    public int perform(int num1, int num2) {
        return num1 + num2;
    }
}