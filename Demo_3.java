package Task3_ShopWork;

public class Demo_3 {
	public static void main(String[] args) {
				
		Product[] products = new Product[100];
		
		Shop shop1 = new Shop("Shop1", "Sofia", 10_000, products);
		
		ProdKg meat = new ProdKg("Meat", 3.5, 10);
		shop1.addProducts(meat);
		ProdKg cheese = new ProdKg("Cheese", 9.9, 20);
		shop1.addProducts(cheese);
		ProdKg fish = new ProdKg("Fish", 5, 30);
		shop1.addProducts(fish);
		
		ProdNum beer = new ProdNum("Beer", 1.8, 100);
		shop1.addProducts(beer);
		ProdNum book = new ProdNum("Book", 3, 50);
		shop1.addProducts(book);
		ProdNum chair = new ProdNum("Chair", 80, 30);
		shop1.addProducts(chair);
		
		System.out.println("Stocks in the store:");
		shop1.stocksInStore(shop1.getProducts());
		
		Basket basket1 = new Basket("Koshnicata na Pesho");
		
		Buyer pesho = new Buyer("Pesho", shop1, 1_000, 100, 0, basket1);
		
		basket1.setBuyer(pesho);
		basket1.purchases = new Product[pesho.getMaxProd()];
		
		basket1.addPurchaseKg(basket1.purchases, meat, 1);
		basket1.addPurchaseKg(basket1.purchases, cheese, 1.5);
		basket1.addPurchaseKg(basket1.purchases, fish, 4);
		basket1.addPurchaseNum(basket1.purchases, beer, 10);
		basket1.addPurchaseNum(basket1.purchases, book, 1);
		basket1.addPurchaseNum(basket1.purchases, chair, 6);
		
		basket1.returnPrchaseNum(basket1.purchases, chair, 2);
		
		pesho.payment();
		System.out.println(pesho.getName()+" money: "+ pesho.getAllCash());
		System.out.println("Shop money: "+ shop1.getMoney());
		
		System.out.println("Stocks in the store:");
		shop1.stocksInStore(shop1.getProducts());
	}
	
	
}
