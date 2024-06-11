package ex1b;

import java.util.*;

public class ToShare implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();
    private Map<String, Client> sharedProducts = new HashMap<>();

    public boolean add(Product p) {
        return products.add(p);
    }

    public Product remove(String code) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getCode().equals(code)) {
                iterator.remove();
                sharedProducts.remove(code);
                return product;
            }
        }
        return null;
    }

    public Product remove(Product p) {
        if (products.remove(p)) {
            sharedProducts.remove(p.getCode());
            return p;
        }
        return null;
    }

    public boolean share(String code, Client user) {
        for (Product product : products) {
            if (product.getCode().equals(code) && !sharedProducts.containsKey(code)) {
                sharedProducts.put(code, user);
                return true;
            }
        }
        return false;
    }

    public boolean share(Product p, Client user) {
        if (products.contains(p) && !sharedProducts.containsKey(p.getCode())) {
            sharedProducts.put(p.getCode(), user);
            return true;
        }
        return false;
    }

    public boolean giveBack(String code) {
        return sharedProducts.remove(code) != null;
    }

    public boolean giveBack(Product p) {
        return sharedProducts.remove(p.getCode()) != null;
    }

    public String allAlugados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total : ").append(sharedProducts.size()).append("\n");
        for (Map.Entry<String, Client> entry : sharedProducts.entrySet()) {
            sb.append(entry.getKey()).append(" shared with ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
