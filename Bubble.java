public class Bubble {

    public static  void printarray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.print();
    }
    public static void main(String[] args) {

        int arr[] = {2,8,9,5,0};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        printarray(arr);

    }
}
