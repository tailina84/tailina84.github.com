/**
 * Created by tln on 13-8-6.
 */
//闰年二月份返回29天，平年二月份返回28天。根据年份和月份返回每个月的天数；
public class IfElse {
    public static void main(String[] args) {
        int year = 2009;
        int month = 9;
        int days;
        if (year%4 == 0){
            days = 29;
        }else {
            days = 28;
        }
//        System.out.println(year+"年"+month+"月"+days+"日");
        if (month ==1 || month ==3 || month ==5 || month ==7|| month == 8 || month ==10
                ||month == 12){
            days =31;
        }else if(month == 4 || month == 6 ||month == 9 ||month == 11){
           days=30;
        }
        System.out.println(year+"年"+month+"月"+days+"日");
    }
}
