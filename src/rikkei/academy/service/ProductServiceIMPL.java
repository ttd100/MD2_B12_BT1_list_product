package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIMPL implements IProductService{
    static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1,50,"Apple"));
        productList.add(new Product(2,90,"Nokia"));
        productList.add(new Product(3,80,"Samsung"));
    }


    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(int id, int price, String name) {
        productList.get(id -1).setPrice(price);
        productList.get(id -1).setName(name);
    }

    @Override
    public void remove(int id) {
        productList.remove(id -1);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product:productList){
            if (product.getName().equals(name)){
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public void sortByName() {
        Collections.sort(productList);
        for (int i = 0; i < productList.size(); i++) {
            productList.get(i).setId(i + 1);
        }
    }
}
