package fr.api.firstapi.product.controller;

import fr.api.firstapi.product.dao.ProductDao;
import fr.api.firstapi.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("unused")
@RestController
public class ProductController {
    @Autowired
    private ProductDao productDao;

    @GetMapping(value = "/products")
    public List<Product> listProducts() {
        return productDao.findAll();
    }

    @GetMapping(value = "/products/{idProduct}")
    public Product getProduct(@PathVariable int idProduct) {
        return productDao.findById(idProduct);
    }

    @PostMapping(value = "/products")
    public Product postProduct(@RequestBody Product product) {
        return productDao.add(product);
    }
}
