/**
 * Created by tln on 13-8-7.
 */
//循环输出26个英文字母；
public class AllEnglishLetters {
    public static void main(String[] args) {
        char [] arrayletter = new char[26];
        char temp ='a';
        int i = 0 ;
        while (i<26){
            arrayletter [i] = temp ;
            i++;
            temp++;
        }
        i=0;
        System.out.println(arrayletter[i]);
        i++;
    }
}
