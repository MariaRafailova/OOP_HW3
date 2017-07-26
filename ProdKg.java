package Task3_ShopWork;

public class ProdKg extends Product{
	//nalichnost v magazina
	private double availabilityКgSh;
	//nalichnost v buyer
	private double availabilityКgB;
	
	public ProdKg(String name, double price, double availabilityKg){
		super(name, price);
		this.availabilityКgSh = availabilityKg;
	}
			
	public void takeKg(double kg){
		//dali iska da vzeme poveche ot nalichnoto? if kg > avail.kg ??
		this.availabilityКgSh -= kg;
		this.availabilityКgB +=kg;		
	}
	
	public void returnKg(double kg){
		this.availabilityКgSh += kg;
		this.availabilityКgB -=kg;
	}
	
	public void showAvailability(){
		System.out.println(this.name+" - "+this.availabilityКgSh+ " kg");
	}
	
	public double getAvailKgB(){
		return this.availabilityКgB;
	}
}
