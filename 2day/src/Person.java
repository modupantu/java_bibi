public class Person {
	public static void main(String[] args){
		Person1 p1 = new Person1("里斯",21);
		System.out.println(p1.getName()+"---"+p1.getAge());
		Person1 p2 = new Person1();
		p2.setName("lisi");
		p2.setAge(24);

		/*
		* p1 和p2 的区别
		* p1 构造方法
		*     给属性进行初始化
		* p2
		*   setxxx 方法
		*    灵活  一般使用这样的方法
		* */
		System.out.println(p2.getName()+"---"+p2.getAge());
	}
}

class Person1{
	private String name;
	private int age;
	public Person1(){

	}
	public Person1(String name,int age){
		 this.name = name;
		 this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return  name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}