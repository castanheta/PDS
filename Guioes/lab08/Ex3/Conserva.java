package Ex3;

public class Conserva implements Component {
    private String name;
    private double weight;

    public Conserva(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Conserva cannot have child components");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Conserva cannot have child components");
    }

    @Override
    public void draw(int indentationLevel) {
        System.out.println(String.format("      Conserva '%s' - Weight : %.1f", name, weight));
    }

    public double getTotalWeight() {
        return weight;
    }
}
