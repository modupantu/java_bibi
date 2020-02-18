public class Demo1Code {
public static void main(String[] args) {
	int x = 10;
	System.out.println(x);
	Student s = new Student();
	Student s1 = new Student();
	Student s2 = new Student();

}
}

class Student {
private String name;
private int age;

public Student() {
}

public Student(String name, int age) {
	this.name = name;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

{
	System.out.println("构造代码块每创建一次对象就执行一次");
}
}