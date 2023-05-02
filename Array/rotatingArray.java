package Array;

import java.util.ArrayList;

public class rotatingArray {
    static void rotate(int arr[],int d,int n){
        // Putting starting element of the array into the temp list
        // later on we will use it to putting into the last or original array
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<d;i++){
            temp.add(arr[i]);
        }

        //Now shifting will be done for the element which comes after d
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        //After shifting we will put the element in last for the rotation
        for(int i=n-d;i<n;i++){
            arr[i]=temp.get(i-(n-d));
        }

    }
    static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    static void rotate2(int arr[],int d,int n){
        if(n==0)
        return ;

        d=d%n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int d=3;
        int n=arr.length;
        rotate2(arr, d, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
