package cn.itcast.testGIT;

public class TestGit2 {
	public static void main(String[] args) {
		System.out.println("这是一个测试类TEST2");
		System.out.println("这是一个测试类TEST2第二次修改");
		System.out.println("这是一个测试类TEST2第三次本地修改");
		System.out.println("这是测试类TEST2第四次本地修改");
		int a=100;
		int b=200;
		System.out.println(max(a,b));
	}

	private static int max(int a, int b) {
		return a<b?a:b;
	}

}
