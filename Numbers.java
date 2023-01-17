public class Numbers {
    int num=10;


}
class Integers extends Numbers{

    Numbers n;

    void Hello() {

        Integers[] Num = {(Integers) n};

    }

    }
    class Text{
        public static void main(String[] args) {
            Integers t = new Integers();
            System.out.println(t.getClass());
            t.Hello();
        }
    }