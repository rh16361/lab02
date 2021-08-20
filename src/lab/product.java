package lab;

public class product {
	
	//class fields
	
	private String prodName;
	private double prodPrice;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	//toString
	public String toString() {
		return String.format("%s $%2.2f", this.getProdName(), this.getProdPrice());
		
	}
	
	public boolean equals(Object other){
		
		if(this.getProdName().equals(((product)other).getProdName())){
			if(this.getProdPrice()==(((product)other).getProdPrice())) {
				return true;
			}
		}
		return false;
	}
	 public product(String prodName, double prodPrice) {
		 this.prodName =prodName;
		 this.prodPrice = prodPrice;
	 }
	 // Our no-args constructor
	 public product() {
		 this.prodName ="Nothing";
		 this.prodPrice =0.0;
		 
	 }
	 
	 
 
}
	
	
	
	


