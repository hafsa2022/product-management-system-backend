package com.hafsaelakhdar.springbootproject.controllers;

import com.hafsaelakhdar.springbootproject.entities.Product;
import com.hafsaelakhdar.springbootproject.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "product")
public class ProductController {
    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createProduct(@RequestBody Product product){
        this.productService.createProduct(product);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Product> getAll(){
        return this.productService.getAll();
    }

    @GetMapping(path="{id}",produces = APPLICATION_JSON_VALUE)
    public Product getProduct(@PathVariable int id){
        return this.productService.getProduct(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable int id){
        this.productService.deleteProduct(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}",consumes = APPLICATION_JSON_VALUE)
    public void updateProduct(@PathVariable int id ,@RequestBody Product product){
    this.productService.updateProduct(id,product);
    }
}
