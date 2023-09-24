package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckWhenProductExistsByName() {
        // Given
        String productName = "Product 1";
        ProductModel product = new ProductModel();
        product.setName(productName);
        product.setPrice(new BigDecimal("100.00"));
        underTest.save(product);

        // When
        Boolean exists = underTest.selectExistsByName(productName);

        // Then
        assertTrue(exists);
    }

    @Test
    void itShouldCheckWhenProductDoesNotExistsByName() {
        // Given
        String productName = "Product 1";

        // When
        Boolean exists = underTest.selectExistsByName(productName);

        // Then
        assertFalse(exists);
    }
}