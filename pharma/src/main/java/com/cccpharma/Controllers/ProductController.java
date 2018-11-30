package com.cccpharma.Controllers;

import java.util.List;

import com.cccpharma.models.Produto;
import com.cccpharma.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public List<Produto> getProducts() {
		return productService.getAll();
	}

//	@PostMapping(value = "cadastrarProduto")
//	public String cadastrarProduto(@RequestBody Produto produto) {
//		if (productService.save(produto) != null) {
//			return "Criou";
//		} else {
//			return "nao";
//		}
//	}
	
	@GetMapping(value="/cadastrarProduto") public String getProduto() { return "OI!";}

}