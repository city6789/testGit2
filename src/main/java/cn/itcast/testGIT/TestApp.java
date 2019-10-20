package cn.itcast.testGIT;

/**
 * 
 * @author Administrator
 *
 */
public class TestApp {
	
	public static void main(String[] args) {
		System.out.println("this is a test class!");
		System.out.println("1111111111111 by heshiyuan");
		System.out.println("222222222222 by heshiyuan");
		
		int a =1;
		int b=2;
		System.out.println("min is"+min(a,b));
	}
	
    private static int min(int a, int b) {
        if(a<b){
            return a;
        }
        return b;
    }

}
