package repository.abstracts;

import entity.Product;

import java.util.List;

public interface ProductRepository {

    void add(Product product);
    List<Product> getAll();

}
