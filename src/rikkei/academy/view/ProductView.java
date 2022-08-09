package rikkei.academy.view;

import rikkei.academy.controller.ProductController;
import rikkei.academy.model.Product;

public class ProductView {
    ProductController productController = new ProductController();
    public void viewProducts(){
        System.out.println("_________________________________");
        System.out.println("SST         PRICE       PRODUCT");
        for (Product product : productController.showProductList()){
            System.out.printf("%3d %11d %13s\n ",product.getId(),product.getPrice(),product.getName());
        }
    }
}
