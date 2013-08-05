/**
 * Created by tln on 13-8-5.
 */
public class ScoreConvert {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch){
            case 'a':
                System.out.println(">=85");
                break;
            case 'b':
                System.out.println(">=60");
                break;
            case 'c':
                System.out.println("<=59");
                break;
            default:
                System.out.println("输入错误");

        }
    }
}
