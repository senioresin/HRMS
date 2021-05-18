package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	
	private ProductService productsService;
	
	@Autowired
	public ProductsController(ProductService productsService) {
		super();
		this.productsService = productsService;
	}


	@GetMapping("/getall")
	public List<Product> getAll() {
		return this.productsService.getAll();
		
	}

}
