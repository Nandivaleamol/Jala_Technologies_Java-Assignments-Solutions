package Java_03_Loops;

//8. Write a program to find Armstrong number or not
public class Problem08 {
    public static void main(String[] args) {
        int n = 370;
        int temp = n;
        int r, sum=0;

        while(n>0){
            r = n%10;
            n = n/10;
            sum = sum+r*r*r;
        }

        if(temp == sum){
            System.out.println("Its an Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
