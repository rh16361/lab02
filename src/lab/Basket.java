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
public boolean addToBasket(Product prod, int qty){
	  if(this.listOfProd.contains(prod)) {//Check if prod is already in our Basket
            int index = this.listOfProd.indexOf(prod);//found it's index position
            int amount = this.matchingListOfProdQtys.get(index);// Product and Qty index are the same
            this.matchingListOfProdQtys.set(index, qty+amount);// Update the previous quantity with qty
            return true; //all went well, so return true
      }else {
           this.listOfProd.add(prod); // This is a new Product in the Basket, so add it here
           this.matchingListOfProdQtys.add(qty); //This is a new product to the Basket, so add its quantity here
           return true; //all went well, so return true
     }
	
}
	
	//toString
public String toString() {
      String out = "Products and Quantity\n"; //set up a temporary String object that we will add information to
      for(int i = 0; i<this.listOfProd.size(); i++) {//size tells us how many elements are in the ArrayList
            out+=this.listOfProd.get(i)+" X "+this.matchingListOfProdQtys.get(i)+"\n";
      }
      return out;
}
	
//total of all products 
    public double total() {
        double total = 0.0; //to hold running total
        for(int i= 0; i<this.listOfProd.size(); i++) { //loop through all the product in our Basket
            //total += get Product at index i, get the unit price * get qty at index i
            total += this.listOfProd.get(i).getProdPrice() * this.matchingListOfProdQtys.get(i);
        }
        return total; //return the computed total
    }	
 	
	
}

