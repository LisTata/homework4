public class Task9 {
    public static void main(String[] args) {
        /*If we list all natural numbers less than 10, multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all numbers that are multiples of 3 or 5 starting
from 0 and up to 1000.*/

        int s=0;
        for (int i =0;i<1000;i++){
            if (i%3==0 || i%5==0)
                 s = s + i;

        }
        System.out.println(s);

    }
}
