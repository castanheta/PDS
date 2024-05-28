package BehavioralPatterns.ex1;

public class CeilingFan {
    private State currentState;

    public CeilingFan() {
        currentState = new OffState(); // initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void pull() {
        currentState.pull(this);
    }

    public String getState() {
        return currentState.getStateName();
    }
}

class OffState implements State {
    public void pull(CeilingFan fan) {
        fan.setState(new LowState());
        System.out.println("Turning fan to low speed.");
    }

    public String getStateName() {
        return "Off";
    }
}

class LowState implements State {
    public void pull(CeilingFan fan) {
        fan.setState(new MediumState());
        System.out.println("Turning fan to medium speed.");
    }

    public String getStateName() {
        return "Low";
    }
}

class MediumState implements State {
    public void pull(CeilingFan fan) {
        fan.setState(new HighState());
        System.out.println("Turning fan to high speed.");
    }

    public String getStateName() {
        return "Medium";
    }
}

class HighState implements State {
    public void pull(CeilingFan fan) {
        fan.setState(new OffState());
        System.out.println("Turning fan off.");
    }

    public String getStateName() {
        return "High";
    }
}