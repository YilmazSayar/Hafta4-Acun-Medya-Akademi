import entity.Product;
import repository.concrete.hibernate.HibernateProductRepository;
import repository.concrete.inmemory.InMemoryProductRepository;
import service.concrete.ProductServiceImpl;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductServiceImpl productServiceImpl = new ProductServiceImpl(new HibernateProductRepository());
        List<Product> products = productServiceImpl.getAll();
        for (var item : products) {
            System.out.println(item.getName());
        }





        }
    }
