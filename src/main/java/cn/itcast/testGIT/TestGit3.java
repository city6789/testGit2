package cn.itcast.testGIT;

public class TestGit3 {
    public static void main(String[] args){
        System.out.println("111111111111");
        System.out.println("3333by heshiyang");
        System.out.println("22222222 by heshiyuan");
        System.out.println("444444444444 by heshiyuan");
        int a=1000;
        int b=200;
        System.out.println(min(a,b));
    }

    private static int min(int a, int b) {
        if(a<b){
            return a;
        }
        return b;
    }
}
