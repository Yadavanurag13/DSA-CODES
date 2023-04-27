package Searching_sorting;

public class selection_sort {
    static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini])
                mini=j;
            }
            //Swapping of the entries
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
    static void bubble_sort(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didswap=1;
                }
            }
            //This is for optimisation
            //if array would be sorted then it will not go further 
            //checking the array ans swapping it

            //it will make the complexcity of the algo to O(n)
            if(didswap==0)
            break;
        }
    }
    static void insertion_sort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            //for the comparison we need to start form the 
            //current position of the element 

            //it will compare to the last 
            // to reach the last position we need to compare on standing with 
            // one the index 1 so we don't need to go to 0 index of the arry
            while(j>0 && arr[j-1]>arr[j]){
                // Bada mile to swap karado
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                //swapping ke baad decrease karo pointer fir bada mile to swap karo
                j--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{6,5,4,3,2,1};
        //selection(arr);
        //bubble_sort(arr);
        insertion_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
