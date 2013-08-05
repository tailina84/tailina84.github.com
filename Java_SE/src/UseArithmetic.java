/**
 * Created by tln on 13-8-3.
 */
public class UseArithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double a2 = 5.0;
        double b2 = 2.0;
        System.out.println(a+ "+"+ b + "=" + (a+b));
        System.out.println(a+ "-"+ b + "=" + (a-b));
        System.out.println(a+ "*"+ b + "=" + (a*b));
        System.out.println(a+ "/"+ b + "=" + (a/b));
        System.out.println(a+ "%"+ b + "=" + (a%b));
        a++;
        System.out.println("a++后a=" +a);
        b--;
        System.out.println("b--后b=" +b);
        b=a++;
        System.out.println("执行b=a++后a=" +a + ",b=" +b);
        b = ++a;
        System.out.println("执行b=++a后a=" +a + ",b=" +b);
        b += a;
        System.out.println("b=" + b);



    }
}
