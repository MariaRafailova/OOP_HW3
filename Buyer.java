package Task3_ShopWork;

public class Buyer {
	private String name;
	private Shop shop;
	private double allCash;
	private int maxProducts;
	private double sumToPay;
	private Basket basket;
	
	public Buyer(String name, Shop shop, double allCash, int maxProduct, double sumToPay, Basket basket){
		this.name = name;
		this.shop = shop;
		this.allCash = allCash;
		this.maxProducts = maxProduct;
		this.sumToPay = sumToPay;
		this.basket = basket;
	}
	
	public void addSumToPay(double money){
		this.sumToPay += money;		
	}
	
	public void returnSumToPay(double money){
		this.sumToPay -= money;		
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getMaxProd(){
		return this.maxProducts;
	}
	
	public void payment(){
		this.allCash -= this.sumToPay;
		this.shop.addMoney(this.sumToPay);
	}
	
	public double getAllCash(){
		return this.allCash;
	}
}
