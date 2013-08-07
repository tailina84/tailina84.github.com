/**
 * Created by tln on 13-8-6.
 */
//考试成绩分别用ABC显示成绩范围；
public class SwitchCase {
    public static void main(String[] args) {
        char ch = 'a' ;
        switch (ch){
            case ('a'):
                System.out.println(">=85");
                break;
            case ('b'):
                System.out.println(">=60");
                break;
            case ('c'):
                System.out.println("<60");
            default:
                System.out.println("输入错误");
        }
    }
}
