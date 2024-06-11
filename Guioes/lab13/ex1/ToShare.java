package ex1;

import java.util.ArrayList;
import java.util.List;

import ex1.Product;
import ex1.ProductsReader;

public class ToShare {

    List<Product> ProductList = new ArrayList<Product>();
    List<Product> sharedProductsList = new ArrayList<Product>();

    public boolean add(Product p){
        if(ProductList.add(p)){
            return true;
        }
        return false;
    }

    public Product remove(String code){
        int index = -1;

        for(int i = 0; i < ProductList.size(); i++){
            if(ProductList.get(i).code().equals(code)){
                index = i;
                break;
            }
        }

        return(ProductList.remove(index));
    }

    public Product remove(Product p){
        int index = -1;

        for(int i = 0; i < ProductList.size(); i++){
            if(ProductList.get(i).equals(p)){
                index = i;
                break;
            }
        }

        return(ProductList.remove(index));
    }


    //Product with ‘code’ will be shared with ‘user’ and will be unavailable until giveBack
    public boolean share(String code, Client user){ 
        int index = -1;

        for(int i = 0; i < ProductList.size(); i++){
            if(ProductList.get(i).code().equals(code)){
                index = i;
                break;
            }
        }

        return(sharedProductsList.add(ProductList.get(index)));
    }

    public boolean share (Product p, Client user){
        int index = -1;

        for(int i = 0; i < ProductList.size(); i++){
            if(ProductList.get(i).equals(p)){
                index = i;
                break;
            }
        }

        return(sharedProductsList.add(ProductList.get(index)));
    }

    public boolean giveBack(String code){
        return false;
    }

    public boolean giveBack(Product p){
        return false;
    }

    public String sharedProducts(){
        int index = -1;
        String produtos = "";

        for(int i = 0; i < ProductList.size(); i++){
            produtos += ProductList.get(i).code();
        }

        return produtos;
    }

    public Product getProducts(){
        return ProductList.get(0);
    }
}
