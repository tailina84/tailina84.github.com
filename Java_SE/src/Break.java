/**
 * Created by tln on 13-8-6.
 */
public class Break {
    public static void main(String[] args) {
        String output = new String();
        stop:
        for (int row = 1; row <=10 ; row++) {
            for (int column = 1; column <=5 ; column++) {
              if (row == 5)  {
                  break stop;
              }

            output ="* ";
            }


        }
        System.out.println(output);
    }
}
