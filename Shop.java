package Task3_ShopWork;

public class Shop {
	private String name;
	private String address;
	private double money;
	private Product[] products;	
	
	public Shop(String name, String address, double money, Product[] products){
		this.name = name;
		this.address = address;
		this.money = money;
		this.products = products;
	}
		
	public void addProducts(Product product){
		for (int j = 0; j < products.length; j++) {
			if (products[j] == null) {
				products[j] = product;				
				break;
			}
		}
		
	}
	
	public void addMoney(double money){
		this.money += money;		
	}
	
	//nalichnosti v magazina
	public void stocksInStore(Product[] products){
		for (int i = 0; i < products.length; i++) {
			if(products[i] instanceof ProdKg){
				((ProdKg)products[i]).showAvailability();
			}
			if(products[i] instanceof ProdNum){
				((ProdNum)products[i]).showAvailability();
			}
		}
	}
	
	public Product[] getProducts(){
		return this.products;
	}
	
	public double getMoney(){
		return this.money;
	}
}
