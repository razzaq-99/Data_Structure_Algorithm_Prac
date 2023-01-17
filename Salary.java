import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        int hours ;
        System.out.println("Enter the number of hours works for a week :");
        Scanner sc = new Scanner(System.in);
        hours = sc.nextInt()*52;

        int amount ;
        System.out.println("Enter money: ");
        amount = sc.nextInt();

        int bonus;
        System.out.println("enter the bnous: ");
        bonus = sc.nextInt();

        int vacation = hours-8;

        int result = (hours *amount+bonus)/52;

        System.out.println("Salary : "+result);


    }
}
