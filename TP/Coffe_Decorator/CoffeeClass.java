package Coffe_Decorator;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}

class MilkDecorator extends CoffeeDecorator {
    private static final double COST = 0.5;
    private static final String DESCRIPTION = "Milk";

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + DESCRIPTION;
    }
}

class SugarDecorator extends CoffeeDecorator {
    private static final double COST = 0.25;
    private static final String DESCRIPTION = "Sugar";

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + DESCRIPTION;
    }
}

class CaramelDecorator extends CoffeeDecorator {
    private static final double COST = 0.75;
    private static final String DESCRIPTION = "Caramel";

    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + DESCRIPTION;
    }
}

public class CoffeeClass {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new CaramelDecorator(coffee);

        System.out.println("Cost: " + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
    }
}