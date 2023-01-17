import java.util.Scanner;

public class MCQ {

    public static void main(String[] args) {
//        String q1 = "";
//        String c1 = "";
//        String c2 = "";
//        String c3 = "";

//        String correct = c2;

        String q1 = "Java is a ";
        String c1 = "keyword";
        String c2 = "case sensitive";
        String c3 = "word";

        String correct;
        System.out.println(q1);
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);

        correct = sc.nextLine();


        if(correct==c2){
            System.out.println("Congrats");
        }

        else
            System.out.println("Invalid choice:");
    }
}
