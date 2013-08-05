/**
 * Created by tln on 13-8-5.
 */
public class UseLogical {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false;
        System.out.println(a+"&&"+a+"="+(a&&a));
        System.out.println(b+"&&"+b+"="+(b&&b));
        System.out.println(a+"||"+a+"="+(a||a));
        System.out.println(b+"||"+b+"="+(b||b));
        System.out.println(a+"&&"+b+"="+(a&&b));
        System.out.println(a+"||"+b+"="+(a||b));
        System.out.println("!"+a+"="+(!a));
    }
}
