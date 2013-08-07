/**
 * Created by tln on 13-8-5.
 */
public class DayOfMonth {
    public static void main(String[] args) {
        int year = 2008;
        int month = 2 ;
        int days ;

            if (year%4==0){
                days = 29;
            }
            else {
                days = 28;
            }
            System.out.println(year+"年"+month+"月"+days+"日");
        }
    }
