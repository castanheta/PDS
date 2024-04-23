package Coffe_Decorator;

public class BasicCoffee implements Coffee {
    private static final double COST = 2.0;
    private static final String DESCRIPTION = "Basic Coffee";

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}