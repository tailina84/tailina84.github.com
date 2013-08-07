import javax.swing.*;
import java.io.IOException;

/**
 * Created by tln on 13-8-6.
 */
//生成菜单并显示
public class Switch {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("input the grade (A,B,C):");
        ch=(char) System.in.read();
            switch (ch){
                case 'A':
                    System.out.println("85-100");
                    break;
                case 'B':
                    System.out.println("60-84");
                    break;
                case 'C':
                    System.out.println("0-59");
                    break;
                default:
                    System.out.println("输入有误");
            }
    }
}

