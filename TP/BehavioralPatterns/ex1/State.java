package BehavioralPatterns.ex1;

public interface State {
    void pull(CeilingFan fan);
    String getStateName();
}
