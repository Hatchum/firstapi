package fr.api.firstapi.product.dao;

import fr.api.firstapi.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    public static List<Product> listProducts = new ArrayList<>();
    static {
        listProducts.add(new Product(1, "Ordinateur", 1000));
        listProducts.add(new Product(2, "Smartphone", 400));
        listProducts.add(new Product(3, "Smart TV", 1500));
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }

    @Override
    public Product findById(int id) {
        for (Product product : listProducts) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public Product add(Product product) {
        listProducts.add(product);
        return product;
    }
}
