package Array;
import java.util.*;;
public class duplicateElement {
    
    static int removeDuplicate(int arr[],int n){
        /*Set decleartion   set will only store unique element  */
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        //this will store the size of the set
        int k=set.size();

        /*copying the element of the set into the arr[] indexing starting with the 1 */
        int j=0;
        for(int x:set){
            arr[j]=x;
            j++;
        }

        return k;
    } 
    static int removeDuplicate1(int arr[], int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,1,2,2,2,3,3};
        int n=arr.length;
        //System.out.println(removeDuplicate(arr, n));
        System.out.println(removeDuplicate1(arr, n));
    }
}
