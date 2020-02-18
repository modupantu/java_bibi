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
/*
* 构造代码块
* */
{
	System.out.println("构造代码块每创建一次对象就执行一次");
}


/*
* 静态代码块（优先于主方法执行的）
* 作用：给类初始化使用，一般加载驱动使用
* 优先与主方法执行
* */
static {
	System.out.println("静态代码块, 只执行一次");
}

}