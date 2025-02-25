package repository;


import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    /**
     * method to add product
     * @param product
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * method update product
     * @param index
     * @param product
     */
    public void updateProduct(int index, Product product) {
        if (index >= 0 && index < products.size()) {
            products.set(index, product);
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

