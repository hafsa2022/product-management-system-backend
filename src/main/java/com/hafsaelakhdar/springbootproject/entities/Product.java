package com.hafsaelakhdar.springbootproject.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String product_size;
    private String prix;
    private String type;
    private Integer stock_quantity;

    public Product(String name, String description, String product_size, String prix, String type, Integer stock_quantity) {
        this.name = name;
        this.description = description;
        this.product_size = product_size;
        this.prix = prix;
        this.type = type;
        this.stock_quantity = stock_quantity;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }
}
