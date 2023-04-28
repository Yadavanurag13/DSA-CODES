package Searching_sorting;

public class Quick_sort {
    static int partition(int arr[],int low,int high){
        int pivot=arr[low];// select the pivot element
        int i=low;
        int j=high;

        while(i<j){
            /*first while will find out first maximum no than pivot element
             * and also we have to take care of the boundary which should be 
             * in limit that's why compartor is being used
             * 
             * 
             * Most imp in first case = comparison has been done 
             * this will put any equal element is the left of the array
            */
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            /*second while loop will find out the minimum element form the right most
            of the array
            */
            while(arr[j]> pivot && j>=low+1){
                j--;
            }
            /* Once we find greater and smallar no it's time to swap them and move on for the next search
             * swapping of the both pointer will take place
            */
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        /*
         * After completing all we have put the pivot element to it's sorted positon
         * we will put to the  jth index
         */
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    static void quickSort(int arr[], int low, int high){
        if(low<high){
           int partIndex=partition(arr,low,high);
           quickSort(arr, low, partIndex-1);
           quickSort(arr, partIndex+1, high);
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{3,1,2,4,1,5,2,6,5};
        int n=arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
  