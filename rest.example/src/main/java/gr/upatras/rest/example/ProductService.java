package gr.upatras.rest.example;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
/**
* @author ctranoris
*
*/


@Service
public class ProductService  implements IProductService {
	// creating an object of ArrayList
	List<Product> products = new ArrayList<Product>();
	int ix = 1000;
	/**
	* adding products to the List
	*/
	public ProductService() {
		super();
		products.add(new Product(100, "Mobile"));
		products.add(new Product(101, "Smart TV"));
		products.add(new Product(102, "Washing Machine"));
		products.add(new Product(103, "Laptop"));
		products.add(new Product(104, "Air Conditioner"));
		products.add(new Product(105, "Refrigerator "));
	}
	/**
	* returns a list of product
	*/
	@Override
	public List<Product> findAll() {
		return products;
	}
	@Override
	public Product findById(int id) {
		for (Product p : products) {
			if (p.getId() == id) {
				return p;
			}
	}
	return null;
	}
	
	@Override
	public Product addProduct(Product p) {
		ix = ix +1; //increase product index
		p.setId( ix );
		products.add( p );
		return p;
	}
	
//	@Override
//	public Product editProduct(Product p) {
//		Product editProd = findById( p.getId() );
//		if ( editProd != null ) {
//			editProd.setPname( p.getPname() );
//			editProd.setPrice( p.getPrice() );
//			return editProd;
//		}
//		return null;
//	}
	
//	@Override
//	public Void deleteProduct(int id) {
//		for (Product p : products) {
//			if (p.getId() == id) {
//				products.remove(p);
//				break;
//			}
//		}
//		return null;
//	}


}
