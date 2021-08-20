package lab;

import java.util.ArrayList;

public class Basket {
	private ArrayList<product>listOfProd;
        private ArrayList<product>mmatchListOfProdQtys;
	
	//constructor
	public Basket(){
		this.listOfProd = new ArrayList<Product>():// create an ArrayList of products
		this.list.matchingListOfProdQtys = new ArrayList<Integer>();// create an ArrayList of integers 
	}
public booleanaddToBasket(Product prod, int qty){
	this.listOfProd.add(prod);// This is a new product in the Basket, so add it here 
	this.matchingListOfProdQtys.add(qty); // This is a new product to the Basket, so add its quantity here return true; // all went well, so return true
}
	
	//toString
public String toString() {
      String out = "Products and Quantity\n"; //set up a temporary String object that we will add information to
      for(int i = 0; i<this.listOfProd.size(); i++) {//size tells us how many elements are in the ArrayList
            out+=this.listOfProd.get(i)+" X "+this.matchingListOfProdQtys.get(i)+"\n";
      }
      return out;
}
	
	
}

