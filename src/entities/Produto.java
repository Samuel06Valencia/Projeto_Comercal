package entities;

public class Produto {
	private String name;
	private double price;
	private int quantity;
	
	
	//Construtor
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Construtor com Sobrecarga
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//método que calcula valor total.
	public double totalValue() {
		return quantity * price;
	}
	//método que adiciona quantidade ao carrinho.
	public void addQuantity(int quantity) {
		 this.quantity += quantity;
	}
	//método que diminui quantidade no carrinho.
	public void removeQuantity(int quantity) {
		 this.quantity -= quantity;
	}
	//método toString() sobreescrito para realizar uma apresentação.
	public String toString() {
		return "Name the product: "+name+", price: "+String.format("%.2f", price)+", Quantity: "+quantity+", total value: $"+totalValue();
	}
	
	
}
