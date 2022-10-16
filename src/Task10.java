public class Task10 {
    public static void main(String[] args) {
        /*2520 is the smallest number that can be divided into each of
the numbers from 1 to 10 without a remainder. Write a program
that calculates the smallest positive number, which is divided by
all numbers from 1 to 20..*/
       int n =2520;
       boolean a = true;
        for (int i=2520;i>0;i++){

            for (int j = 1; j <=20 ; j++) {
                if(i%j==0)
                    a=true;
                else {
                    a=false;
                    break;}
            }
            if (a){
                System.out.println(i);
                break;
            }
        }
    }
}
