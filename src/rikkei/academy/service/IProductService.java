package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    public void save(Product product);
    public void edit(int id, int price, String name);
    public void remove(int id);
    List<Product> search(String name);
    void sortByName();
}
