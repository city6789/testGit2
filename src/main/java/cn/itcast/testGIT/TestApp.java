package cn.itcast.testGIT;

/**
 * @author Administrator
 */
public class TestApp {
	
	public static void main(String[] args) {
		System.out.println("this is a test class!");
		System.out.println("1111111111111 by heshiyuan");
		System.out.println("222222222222 by heshiyuan");
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		printArr(arr);
	}

	public static void  printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
}