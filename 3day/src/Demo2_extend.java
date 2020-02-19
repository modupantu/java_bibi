public class Demo2_extend {
public static void main(String[] a) {
  DemoC c = new DemoC();
  c.show2();
  c.show1();
}
}
/*
* java不支持多继承
*
class DemoC extends DemoB,DemoA {
public void show2() {
	System.out.println('C');
}
}


*
* 但是支持多层继承
* */
class DemoA {
public void show() {
	System.out.println('A');
}
}

class DemoB extends DemoA {
public void show1() {
	System.out.println('B');
}
}

class DemoC extends DemoB {
public void show2() {
	System.out.println('C');
}
}