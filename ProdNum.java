package Task3_ShopWork;

public class ProdNum extends Product{
	//nalichnost v magazina
	private int availabilityNumberSh;
	//nalichnost v buyer
	private int availabilityNumberB;
	
	public ProdNum(String name, double price, int availabilityNumber) {
		super(name, price);
		this.availabilityNumberSh = availabilityNumber;		
	}

	public void takeNum(int number){
		//if number > aval.Num ?
		this.availabilityNumberSh -= number;
		this.availabilityNumberB += number;		
	}
	
	public void returnNum(int num){		
		this.availabilityNumberSh += num;	
		this.availabilityNumberB -=num;
	}
	
	void showAvailability(){
		System.out.println(this.name+" - "+this.availabilityNumberSh+ " num");
	}
	
	public int getAvailNumB(){
		return this.availabilityNumberB;
	}
}
