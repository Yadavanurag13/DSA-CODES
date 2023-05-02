package Array;

import java.util.ArrayList;

public class moveZerosToEnd {
    static void moverbrute(int arr[],int n){
        // Adding non zero entries to the temp list

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        // Now shifting the element to the intial array

        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }

        // now making the reamaining array place to zero
        for(int i=temp.size();i<n;i++){
            arr[i]=0;
        }

    }

    static void moveroptimal(int arr[],int n){
        // Optimal solution is based on the two pointer approch

        // find the index of the first zero entry and keep one pointer 
        // on that a second one next to it 
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        //if second pointer find a non zero element swap it in increase first pointer 
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,0,2,3,2,0,0,4,5,1};
        int n=arr.length;
        moverbrute(arr, n);
        moveroptimal(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
