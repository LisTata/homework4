import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        /*The first day an athlete ran x kilometers, and then every day he
increased the mileage by 10% from the previous value. According
to the number y indicated from the keyboard, determine the
number of the day, when the athlete’s mileage will be at least y
kilometers*/
        Scanner sc = new Scanner(System.in);
        double x= sc.nextDouble();
        double y = sc.nextDouble();
        int day = 1;
        while (x<y){
            x=x+x/10;
            day++;

        }
        System.out.println(day);
    }
}
