package com.hafsaelakhdar.springbootproject.services;

import com.hafsaelakhdar.springbootproject.entities.Product;
import com.hafsaelakhdar.springbootproject.repositories.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product){
        this.productRepository.save(product);
    }

    public List<Product> getAll() {
       return this.productRepository.findAll();
    }

    public Product getProduct(int id) {
        Optional<Product> product = this.productRepository.findById(id);
        return product.orElseThrow(
                () -> new EntityNotFoundException("Aucun client avec cet id")
        );
    }

    public void deleteProduct(int id) {
        this.productRepository.deleteById(id);
    }

    public void updateProduct(int id, Product product) {
        Product selectedProduct = this.getProduct(id);
        if(selectedProduct != null){
            selectedProduct.setName(product.getName());
            selectedProduct.setDescription(product.getDescription());
            selectedProduct.setProduct_size(product.getProduct_size());
            selectedProduct.setPrix(product.getPrix());
            selectedProduct.setStock_quantity(product.getStock_quantity());
            this.productRepository.save(selectedProduct );
        }
        this.productRepository.save(selectedProduct);

    }


}
