package Ex3;


public interface Component {
    void add(Component component);
    void remove(Component component);
    void draw(int indentationLevel);
    double getTotalWeight();
}