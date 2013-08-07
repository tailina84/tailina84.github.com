/**
 * Created by tln on 13-8-6.
 */
//程序5】题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
// 60分以下的用C表示。

public class E5 {
    public static void main(String[] args) {
        int grade = 8 ;
        System.out.println((grade>=90)?("A"):(grade>=60)?("B"):("C"));
        System.out.println("-------");
         if (grade>=90){
            System.out.println("A");
        }else if(grade>=60){
            System.out.println("B");
        }else if(grade<60){
            System.out.println("C");
        }
    }
}


