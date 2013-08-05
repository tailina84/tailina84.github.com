/**
 * Created by tln on 13-8-5.
 */
public class DayOfMonth {
    public static void main(String[] args) {
        int year = 2008;
        int month = 2 ;
        int days ;
        if (month == 2 ){
            if (year%4==0){
                days = 29;
            }
            else {
                days = 28;
            }

            System.out.println(year+"年"+month+"月"+days+"日");
        }
        else if (month==4||month==6||month==9||month==11){
            days=30;
        }
        else {
            days=31;
        }
    }

}