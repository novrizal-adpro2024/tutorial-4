package id.ac.ui.cs.advprog.eshop.controller;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    private ProductService productService;

    @Mock
    private Model model;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreateProductPage() {  // added new controller tests (forgot to commit before)
        String expectedViewName = "CreateProduct";
        String actualViewName = productController.createProductPage(model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testCreateProductPost() {  // added new controller tests (forgot to commit before)
        Product product = new Product();
        String expectedViewName = "redirect:list";
        String actualViewName = productController.createProductPost(product, model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testProductListPage() {    // added new controller tests (forgot to commit before)
        List<Product> productList = new ArrayList<>();
        when(productService.findAll()).thenReturn(productList);
        String expectedViewName = "ProductList";
        String actualViewName = productController.productListPage(model);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testDeleteProduct() {  // added new controller tests (forgot to commit before)
        Product product = new Product();
        String productId = product.getProductId();
        String expectedViewName = "redirect:/product/list";
        String actualViewName = productController.deleteProductGet(product, model, productId);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testEditProductPage() {    // added new controller tests (forgot to commit before)
        Product product = new Product();
        String productId = product.getProductId();
        Mockito.lenient().when(productService.findById(productId)).thenReturn(product);
        String expectedViewName = "EditProduct";
        String actualViewName = productController.editProductPage(model, productId);
        assertEquals(expectedViewName, actualViewName);
    }

    @Test
    void testEditProductList() {    // added new controller tests (forgot to commit before)
        Product product = new Product();
        String productId = product.getProductId();
        String expectedViewName = "redirect:/product/list";
        String actualViewName = productController.editProductPost(product, model, productId);
        assertEquals(expectedViewName, actualViewName);
    }
}