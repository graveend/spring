package spring.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import spring.domain.Product;

public class ProductManagerTest extends TestCase
{
	private ProductManager productManager;
	private List<Product> products;
	
	private static final String CAR = "Maruthi";
	private static final String COMPUTER = "ACER";
	private static final double CAR_PRICE = new Double(300000);
	private static final double COMPUTER_PRICE = new Double(900000);
	
	
	public void setUp()
	{
		productManager = new ProductManager();
		List<Product> products = new ArrayList<>();
		
		Product product = new Product();
		product.setName(CAR);
		product.setPrice(CAR_PRICE);
		products.add( product );
		
		product = new Product();
		product.setName(COMPUTER);
		product.setPrice(COMPUTER_PRICE);
		products.add( product );
		
		productManager.setProducts(products);
	}
	
	public void testGetProductsWithNoProduct()
	{
		productManager = new ProductManager();
		assertNull(productManager.getProducts());
	}
	
	public void testGetProducts()
	{
		List<Product> prods = productManager.getProducts();
		assertNotNull(prods);
		
		Product prod1 = prods.get(0);
		assertEquals(CAR, prod1.getName());
		assertEquals(CAR_PRICE, prod1.getPrice());
		
		Product prod2 = prods.get(1);
		assertEquals(COMPUTER, prod2.getName());
		assertEquals(COMPUTER_PRICE, prod2.getPrice());
		
		
	}
}
