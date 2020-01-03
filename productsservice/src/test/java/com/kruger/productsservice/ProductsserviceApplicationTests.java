package com.kruger.productsservice;

import com.kruger.productsservice.model.PRODUCT_CONDITION;
import com.kruger.productsservice.model.PRODUCT_STATUS;
import com.kruger.productsservice.model.Product;
import com.kruger.productsservice.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductsserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void loadTableToDB(){
		Product product = new Product();
		ProductService productService = new ProductService();

		product.setCategory("Phone");
		product.setDescription("iPhone 11");
		product.setInStock(10);
		product.setManufacturer("Apple");
		product.setName("iPhone 11");
		product.setPrice(1500000);
		product.setProductCondition(PRODUCT_CONDITION.NEW.getConditionDescription());
		product.setProductStatus(PRODUCT_STATUS.IN_STOCK.getProductStatusDescription());
		productService.addProduct(product);

	}

}
