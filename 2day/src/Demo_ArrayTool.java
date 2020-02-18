public class Demo_ArrayTool {
  public static void main(String[] a){
  	int[] arr = {1,2,3,4};
//  	ArrayTool at = new ArrayTool();
  	int max = ArrayTool.getMax(arr);
	  System.out.println(max);
	  System.out.println("---------------");
	  ArrayTool.print(arr);
	  System.out.println("---------------");
	  ArrayTool.revArray(arr);
	  ArrayTool.print(arr);
  }
}

