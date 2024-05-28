package BehavioralPatterns.ex2;


public class NumberProcessor {
    private Operation operation;

    public NumberProcessor(Operation operation) {
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int performOperation(int num1, int num2) {
        return operation.perform(num1, num2);
    }
}
