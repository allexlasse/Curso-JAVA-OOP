package entities;

public class Product {

	public String Name;
	public double Price;
	public int Quantity;
	
	public Product() {
		// construtor personalizável;
	}
	
	public Product(String name, double price, int quantity) {
		Name = name;
		Price = price;
		Quantity = quantity;
	}
	
	public double TotalValueInStock() {
		return Price * Quantity;
	}
	
	public void AddProduct(int quantity) {
		Quantity += quantity; 
	}
	
	public void RemoveProduct(int quantity) {
		Quantity -= quantity;
	}
	
	public String toString() {
		return "Name: " + Name
				+ "\nPrice: R$" + String.format("%.2f", Price) 
				+ "\nQuantity: " + Quantity;
	}
}
