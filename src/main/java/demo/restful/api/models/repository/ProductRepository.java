package demo.restful.api.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.restful.api.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
}
