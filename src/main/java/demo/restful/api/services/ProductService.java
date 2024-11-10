package demo.restful.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.restful.api.models.entities.Product;
import demo.restful.api.models.repository.ProductRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product findOne(Long id) {
        return productRepository.findById(id).get();
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public void remove(Long id) {
        productRepository.deleteById(id);
    }
}