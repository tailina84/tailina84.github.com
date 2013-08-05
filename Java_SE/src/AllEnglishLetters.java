/**
 * Created by tln on 13-8-5.
 */
public class AllEnglishLetters {
    public static void main(String[] args) {
        char [] arrayLetter = new char [26];
        char temp = 'A';
        int i = 0 ;
        while(i<26){
            arrayLetter [i] = temp ;
            i++;
            temp++;
        }
        i=0;
        while (i<26){
            System.out.println("第"+(i+1) + "个英文字母是："+arrayLetter[i]);
            i++;
        }


    }
}
