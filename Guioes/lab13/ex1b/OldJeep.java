package ex1b;

public class OldJeep {
    private String code;
    private String description;
    private double points;

    public OldJeep(String data) {
        String[] parts = data.split(";");
        this.code = parts[0];
        this.description = parts[1];
        this.points = Double.parseDouble(parts[2]);
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPoints() {
        return points;
    }
}
