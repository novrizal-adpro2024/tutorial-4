package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create (Product product) {
        if(product.getProductQuantity() < 0){
            product.setProductQuantity(0);
        }
        productData.add(product);
        return product;
    }

    public Product edit(Product editedProduct){

        //Input nama editedProduct string kosong
        if(editedProduct.getProductName().equals("")){
            editedProduct.setProductName("Unnamed Product");
        }

        //Input jumlah editedProduct bilangan negatif
        if(editedProduct.getProductQuantity() < 0){
            editedProduct.setProductQuantity(0);
        }

        for (int i = 0; i < productData.size(); i++) {
            Product product = productData.get(i);
            if(product.getProductId().equals(editedProduct.getProductId())){
                productData.set(i, editedProduct);
                return editedProduct;
            }
        }
        return null;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }
}