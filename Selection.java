public class Selection {
    public static  void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr [] = {3,2,9,6,4,4};
        for(int i=0; i< arr.length; i++){
            int smallest = i;
            for(int j=i; j<arr.length; j++){

                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
}
