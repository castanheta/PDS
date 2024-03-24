public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza takeOrder(String dough, String sauce, List<String> toppings) {
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setSauce(sauce);
        for (String topping : toppings) {
            pizzaBuilder.addTopping(topping);
        }
        return pizzaBuilder.build();
    }
}