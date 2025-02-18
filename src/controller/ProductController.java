package controller;

import model.Product;
import repository.ProductRepository;

public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, double price, String originRegion) {
        Product product = new Product(name, price, originRegion);
        productRepository.addProduct(product);
    }

    public void updateProduct(int index, String name, double price, String originRegion) {
        Product product = new Product(name, price, originRegion);
        productRepository.updateProduct(index, product);
    }

    public void removeProduct(int index) {
        productRepository.removeProduct(index);
    }

    public void showAllProducts() {
        for (Product product : productRepository.getAllProducts()) {
            System.out.println(product);
        }
    }
}

