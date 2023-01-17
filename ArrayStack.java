//public class ArrayStack implements Stack {
//    private Object[] a;
//    int size;
//
//    public ArrayStack(int cap) {
//        a = new Object[cap];
//    }
//
//    public boolean isEmpty() {
//        return (size == 0);
//    }
//
//    public Object peek() {
//        if (size == 0) {
//            return new IllegalStateException();
//        }
//            return a[size - 1];
//    }
//
//    public Object pop() {
//        if (size == 0) {
//            return new IllegalStateException();
//
//        }
//            Object obj = a[--size];
//            a[size] = null;
//            return obj;
//        }
//
//
//    public void push(Object obj){
//        if(size==a.length)
//            resize();
//        else
//            a[size++] = obj;
//
//    }
//
//    public int size(){
//        return size;
//    }
//    private void resize(){
//        Object[] aa = a;
//        a = new Object[2*aa.length];
//        System.arraycopy(aa,0,a,0,size);
//    }
//}
//class Main{
//    public static void main(String[] args) {
//
//        ArrayStack as = new ArrayStack(5);
//        as.push("apple");
//       as.isEmpty();
//        as.push("grapes");
//        System.out.println(as.size());
//        as.push("mangoes");
//        as.push("pineApple");
//        as.push("Orange");
//        System.out.println(as.size());
//        as.push("DryFruit");
//        System.out.println(as.size());
//        as.push("ETC");
////        System.out.println(as.peek());
//
//    }
//}
interface Stack{
    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int size();

}
public class ArrayStack implements Stack{
//    private int size;
//    private Object[] a;
//
//    public ArrayStack(int i){
//        a=new Object[i];
//
//    }
//    public Object peek(){
//        if(size==0){
//            throw new IllegalStateException();
//        }
//        return a[size-1];
//    }
//    public Object pop(){
//        if(size==0){
//            throw new IllegalStateException();
//        }
//        Object obj = a[--size];
//        a[size]=null;
//        return obj;
//    }
//    public void push(Object obj){
//        if(size==a.length){
//            resize();
//        }
//        a[size++]=obj;
//
//    }
//    public int size(){
//        return size;
//    }
//    public boolean isEmpty(){
//        return (size==0);
//    }
//    private void resize(){
//        Object[] aa=a;
//        a=new Object[2*aa.length];
//        System.arraycopy(aa, 0, a, 0, size);
//    }
//
//    public static void main(String[] args) {
//        ArrayStack fruitcrates=new ArrayStack(6);
//        fruitcrates.push("Apples");
//        fruitcrates.push("Kiwis");
//        fruitcrates.push("Dragon Fruit");
//        fruitcrates.pop();
//        fruitcrates.push("Pomegrnate");
//        fruitcrates.push("Grapes");
//        fruitcrates.push("Peach");
//        fruitcrates.push("Orange");
//        fruitcrates.push("Guava");
//        fruitcrates.push("Chikoo");
//        fruitcrates.push("Malta");
//
//        System.out.println(fruitcrates.isEmpty());
//        System.out.println(fruitcrates.peek());
//        System.out.println(fruitcrates.size);
//
//    }

    int size;
    private Object[] a;
    public ArrayStack(int x){
        a=new Object[x];
    }

    public Object peek(){
        if(size==0){
            return new IllegalStateException();
        }
        return a[size-1];
    }

    public Object pop(){
        if(size==0){
            return new IllegalStateException();
        }

        Object obj = a[--size];
        a[size]=null;
        return obj;
    }

    public void push(Object x){
        if(size==a.length){
            resize();
        }
        a[size++]=x;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void resize(){
        Object aa = a;
        a=new Object[2*a.length];
        System.arraycopy(aa,0,a,0,size);
    }


    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(123);
        stack.push(345);
        stack.push("Dogma");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}