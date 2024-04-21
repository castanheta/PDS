package Ex3;


public class Doce implements Component {
    private String name;
    private double weight;

    public Doce(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Doce cannot have child components");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Doce cannot have child components");
    }

    @Override
    public void draw(int indentationLevel) {
        System.out.println(String.format("      Doce '%s' - Weight : %.1f", name, weight));
    }


    public double getTotalWeight() {
        return weight;
    }
}