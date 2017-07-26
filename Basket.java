package Task3_ShopWork;

public class Basket {
	private String name;
	private Buyer buyer;
	public Product[] purchases;
	
	public Basket(String name){
		this.name = name;		
	}	

	public void addPurchaseKg(Product[] purchases, ProdKg product, double kg) {
		for (int i = 0; i < purchases.length; i++) {
			if (purchases[i] == null) {
				purchases[i] = product;
				product.takeKg(kg);
				this.buyer.addSumToPay(kg*product.price);
				System.out.println(this.buyer.getName()+" adds to his basket "+product.name+" "+kg+" kg");
				break;
			}
		}
	}

	public void addPurchaseNum(Product[] purchases, ProdNum product, int num) {
		for (int i = 0; i < purchases.length; i++) {
			if (purchases[i] == null) {
				purchases[i] = product;
				product.takeNum(num);
				this.buyer.addSumToPay(num*product.price);
				System.out.println(this.buyer.getName()+" adds to his basket "+product.name+" "+num+" numbers");
				break;
			}
		}
	}

	public void returnPrchaseKg(Product[] purchases, ProdKg product, double kg) {
		for (int i = 0; i < purchases.length; i++) {
			if (purchases[i].name.equals(product.name)) {				
				product.returnKg(kg);
				if (product.getAvailKgB() == 0) {
					purchases[i] = null;// ako vrashta vsichko
				}				
				this.buyer.returnSumToPay(kg*product.price);
				System.out.println(this.buyer.getName()+" return "+product.name+" - "+kg+" kg");
				break;
			}
		}
	}

	public void returnPrchaseNum(Product[] purchases, ProdNum product, int num) {
		for (int i = 0; i < purchases.length; i++) {
			if (purchases[i].name.equals(product.name)) {				
				product.returnNum(num);				
				if (product.getAvailNumB() == 0) {
					purchases[i] = null;// ako vrashta vsichki
				}					
				this.buyer.returnSumToPay(num*product.price);
				System.out.println(this.buyer.getName()+" return "+product.name+" - "+num+" numbers");
				break;
			}
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setBuyer(Buyer buyer){
		this.buyer = buyer;
	}
	
	public Buyer getBuyer(){
		return this.buyer;
	}
}
