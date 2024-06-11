package ex1;

import java.util.ArrayList;
import java.util.List;

import ex1.ProductsReader;

public class Client implements ProductsReader{

    String points;
    String name;
    List<Product> ClientProductList = new ArrayList<Product>();

    public Client(String points, String name){
        this.points = points;
        this.name = name;
    }
    
    public List<Product> getItems(){
        return null;
    }
}
