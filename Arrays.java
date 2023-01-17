
import java.util.Scanner;
public class Arrays {



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int RollNo[]=new int[2];
            int oopMarks[]=new int[2];

            for(int i=0;i<2;i++){
                System.out.println("Enter the rollNo");
                RollNo[i]=sc.nextInt();
                System.out.println("Enter the oopMarks");
                oopMarks[i]=sc.nextInt();

            }
            int myClass[][]=new int[2][2];
            for(int j=0;j<2;j++){
                myClass[j][0]=RollNo[j];
                myClass[j][1]=oopMarks[j];

            }
            System.out.println("RollNo    oopMarks   ");
            for(int k=0;k<2;k++) {
                for(int l=0;l<2;l++){
                    System.out.print(myClass[k][l]+"        ");
                }
                System.out.println("");
            }
        }
    }

