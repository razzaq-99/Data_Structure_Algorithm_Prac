
import java.util.Scanner;

public class DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] RollNo= new String[2];
        String [] name =  new String [2];

        String [][] students = new String[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                students[i][j] = sc.nextLine();

            }

        }
        System.out.println("Name"+" "+"RollNo");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){

                students[i][0] = name[i];
                students[0][j] = RollNo[j];
                System.out.println(name[i] + " "+RollNo[j]);
            }

        }



        }

    }
