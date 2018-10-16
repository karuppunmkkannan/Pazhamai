package com.dao;

import java.util.List;

import com.model.Product;

public interface CommonDao {

	String saveProduct(Product prod);

	List<Product> getProduct();

}
