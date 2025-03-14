package repository.concrete.hibernate;

import entity.Category;
import entity.Product;
import repository.abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductRepository implements ProductRepository {

        private List<Product> products;

        public HibernateProductRepository() {
            products = new ArrayList<Product>();


            //seed data

            products.add(new Product(1, "İphone 15", 5000, "Telefon", new Category(1, "Elektronik")));

        }

        @Override
        public void add(Product product) {
            System.out.println("Adding product on Hibernate");
            products.add(product);

        }

        @Override
        public List<Product> getAll() {
            System.out.println("Getting all products on Hibernate");
            return products;

        }

    }


