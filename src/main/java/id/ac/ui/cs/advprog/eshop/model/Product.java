package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter @Setter
public class Product {

    public Product(){
        this.productId = UUID.randomUUID().toString();
    }

    private String productId;
    private String productName;
    private int productQuantity;
}