package ex1;
import ex1.Product;

public class Car implements Product{

    String code;
    String description;
    double points;

    public Car(String code, String description, double points){
        this.code = code;
        this.description = description;
        this.points = points;
    }
    
    public String code(){
        return this.code;
    }

	public String description(){
        return this.description;
    }

	public double points(){
        return this.points;
    }
}
