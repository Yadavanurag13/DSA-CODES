package Array;

public class largest {
    static int large(int arr[],int n){
        int l=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }
    public static void main(String args[]){
        int arr[]=new int []{1,2,4,7,7,5};
        int n=arr.length;
        System.out.println(large(arr, n));
    }
}
