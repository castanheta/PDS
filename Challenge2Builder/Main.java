public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Waiter waiter = new Waiter(pizzaBuilder);

        // Example order for a Hawaiian Pizza
        List<String> hawaiianToppings = Arrays.asList("ham", "pineapple");
        Pizza hawaiianPizza = waiter.takeOrder("thin", "tomato", hawaiianToppings);

        // Example order for a Spicy Pizza
        List<String> spicyToppings = Arrays.asList("pepperoni", "jalapenos");
        Pizza spicyPizza = waiter.takeOrder("thick", "spicy tomato", spicyToppings);

        // Print details of the pizzas
        System.out.println("Hawaiian Pizza: " + hawaiianPizza.getDough() + ", " + hawaiianPizza.getSauce() + ", " + hawaiianPizza.getToppings());
        System.out.println("Spicy Pizza: " + spicyPizza.getDough() + ", " + spicyPizza.getSauce() + ", " + spicyPizza.getToppings());
    }
}