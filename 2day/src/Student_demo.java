public class Student_demo {
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(23);
    System.out.println("我的姓名是"+s1.getName()+"我的年龄是"+s1.getAge());
		Student s2 = new Student("li",1);
    s2.show();
	}
}

/*
* 案例
*设置学生姓名和年龄
* */

class Student{
	private String name;
	private int age;
	public  Student(){}
	public  Student(String name,int age){
		this.name=name;
		this.age =age;
	}
	public void setName (String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age =  age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("我的姓名是"+name+"我的年龄是"+age);
	}
}