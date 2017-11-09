package spring.service;

import java.util.ArrayList;
import java.util.List;

import spring.domain.Product;

public class ProductManager implements IProductManager
{
	List<Product> products;
	
	@Override
	public void increasePrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Product> getProducts() {
		//throw new UnsupportedOperationException();
		return products;
	}
	
	
	public void setProducts(List<Product> product)
	{
		products = product;
	}

}
