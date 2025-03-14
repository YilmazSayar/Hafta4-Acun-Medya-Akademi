package service.abstracts;

import entity.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);
    List<Product> getAll();
}
