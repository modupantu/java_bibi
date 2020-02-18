class Tel {
public static void main(String[] args){
  Phone p1 = new Phone();
  p1.setBrand("pingguo");
  p1.setPrice(2000);
	System.out.println('q'+p1.getBrand()+'w'+p1.getPrice());
	Phone p2 = new Phone("xiaomi",200);
	p2.show();
}
}


/*
* 手机类
* */


class Phone{
	private String brand;
	private int price;
	public Phone(){}
	public Phone(String brand,int price){
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand){
		this.brand =brand;
	}
	public String getBrand(){
		return  brand;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
	public void show(){
		System.out.println('q'+brand+'w'+price);
	}
}