/**
 * Created by tln on 13-8-6.
 */
//【程序2】题目：判断101-200之间有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
public class For {
    public static void main(String[] args) {
        int z = 0 ;
        for (int i = 101; i < 201; i++) {
            int j = 2;
            for (j = 2; j <i/2+1; j++) {
                if (i%j==0){
                    break;
                }

            }
            if (j == (i/2+1)){
                System.out.println(i);
                z++;
            }
        }
        System.out.println(z);
    }
}


