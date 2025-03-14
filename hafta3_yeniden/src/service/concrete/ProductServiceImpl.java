package service.concrete;
import entity.Product;
import repository.abstracts.ProductRepository;
import service.abstracts.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {

        this.repository = repository;
    }




    public void add(Product product){

        if (product.getPrice()<0){
            throw new RuntimeException("Price cannot be less than 0");}

        repository.add(product);

    }




    public List<Product> getAll(){

        //return inMemoryProductRepository.getAll();
        return repository.getAll();
    }

}
