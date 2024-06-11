package ex1b;

public class Van implements Product {
    private String code;
    private String description;
    private double points;

    public Van(String code, String description, double points) {
        this.code = code;
        this.description = description;
        this.points = points;
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
        return "Van [code=" + code + ", descr=" + description + ", points=" + points + "]";
    }
}
