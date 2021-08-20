package lab;

public class Lab2Driver {
	public static void main(String[] args){
		//Create an instance of your product
		product prod1 = new product();
		
		//Update the product name and price
		prod1.setProdName("Sprite");
		prod1.setProdPrice(1.99);
		
		//Display what we have to console
		System.out.println("The product name is> "+prod1.getProdName());
		System.out.println("The product price is > "+prod1.getProdPrice());
		
		
		//String representation of a Product object
		System.out.println(prod1);
		
		//Check for Product equality 
		product prod2 = new product();
		prod2.setProdName("Sprite");
		prod2.setProdPrice(1.99);
		System.out.println("Are prod1 and prod2 equal? > " + prod1.equals(prod2));
		
		product prod3 = new product();
		prod3.setProdName("Cheese Burger");
		prod3.setProdPrice(5.00);
		System.out.println("Are prod2 and prod3 equal? > " + prod3.equals(prod2));
		
		//Product to string without using the setters
		product prod4 = new product();
		System.out.println(prod4);
		
		product prod5 = new product("Coca-Cola",2.05);
		System.out.println(prod5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}

