package spring.service;

import java.util.List;

import spring.domain.Product;

public interface IProductManager 
{
	public void increasePrice();
	
	public List<Product> getProducts();
}
