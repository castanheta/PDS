package ex1b;

public class Jeep implements Product {
    private String code;
    private String description;
    private double points;

    public Jeep(String code, String description, double points) {
        this.code = code;
        this.description = description;
        this.points = points;
    }

    public Jeep(OldJeep oldJeep) {
        this.code = oldJeep.getCode();
        this.description = oldJeep.getDescription();
        this.points = oldJeep.getPoints();
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Jeep [code=" + code + ", descr=" + description + ", points=" + points + "]";
    }

}
