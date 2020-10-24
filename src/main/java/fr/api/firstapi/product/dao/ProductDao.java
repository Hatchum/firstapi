package fr.api.firstapi.product.dao;

import fr.api.firstapi.product.model.Product;
import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product add(Product product);
}
