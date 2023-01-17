import java.sql.SQLOutput;
import java.util.Scanner;

public  class First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("enter your age :");
        age = sc.nextInt();

        if(age<13 & age>0 ){
            System.out.println("you have to pay $5");
        }
        else if(age>=13 & age<65){
            System.out.println("you have to pay $10");
        }
        else if (age>=65)
            System.out.println("You have to pay $7");

        else
            System.out.println("invalid:");
    }

}

