public class Condition {


        int marks;
        void setMarks(int marks){
            if(marks >= 0 || marks <=100){
                this.marks = marks;
            }


        }
        public int getMarks(){
            return marks;
        }
    public static void main(String[] args) {
        Condition c = new Condition();
        c.setMarks(200);
        System.out.println(c.getMarks());
    }
}
