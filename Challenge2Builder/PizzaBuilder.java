public class PizzaBuilder {
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(dough, sauce, toppings);
    }
}