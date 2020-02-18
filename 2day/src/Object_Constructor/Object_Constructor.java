package Object_Constructor;

class Object_Contructor {
  public static void main(String[] ages){
	  Person p = new Person();
		p.show();

		System.out.println("----------");

		Person p2 = new Person("lisi",12);
		p2.show("ssss",123);
	  p2.show();
  }

}

class Person{
	private String name;
	private int age;
//	构造方法
	public Person(){
		name = "张三";
		age = 20;
    System.out.println("hello");
	}
	public Person(String name,int age){
		this.name = name;
		this.age =age;
		System.out.println("hello");
	}
	public void show(){
		System.out.println(name+'1'+age);
	}
	//	重载
	public void show(String name,int age){
		System.out.println(name+"....."+age);
	}
}