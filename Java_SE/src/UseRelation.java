/**
 * Created by tln on 13-8-5.
 */
public class UseRelation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String s = "aaaaaa";
        System.out.println(a+">"+b+""+(a>b));
        System.out.println(a+"<"+b+""+(a<b));
        System.out.println(a+">="+b+""+(a>=b));
        System.out.println(a+"<="+b+""+(a<=b));
        System.out.println(a+"=="+b+""+(a==b));
        System.out.println(a+"!="+b+""+(a!=b));
        if(s instanceof String){
            System.out.println("s is a String object");
        }
    }
}
