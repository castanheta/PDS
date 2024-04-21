package Ex3;


import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {
    private String name;
    private double weight;
    private List<Component> components = new ArrayList<>();

    public Caixa(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void draw(int indentationLevel) {
        String indentation = "";
        for (int i = 0; i < indentationLevel; i++) {
            indentation += "  ";
        }
        System.out.println(String.format("%s*Caixa '%s' [ Weight: %.1f ; Total: %.1f]", indentation, name, weight, getTotalWeight()));
        for (Component component : components) {
            component.draw(indentationLevel + 1);
        }
    }

    public double getTotalWeight() {
        double totalWeight = weight;
        for (Component component : components) {
            totalWeight += component.getTotalWeight();
        }
        return totalWeight;
    }
}