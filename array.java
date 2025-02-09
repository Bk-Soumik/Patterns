import java.util.*;
public class array {

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = ( start + end ) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void swap(int arr[]){
        int first = 0, last = arr.length-1;
        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printSubarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void subarrSum(int arr[]){                 //Time Complexicity: O(n^3)
        int currSum = 0;                                     //Brute Force
        int maxSubarrSum = 0;

        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println("Sum of sub arr = " + currSum);
                if(currSum > maxSubarrSum){
                    maxSubarrSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum of sub array is : " + maxSubarrSum);
    }

     public static void maxSubarrSum2(int arr[]){                     //Time Complexicity: O(n^3)
        int currSum = 0;                                            //Brute Force
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
         int start = i;
         for(int j = i; j < arr.length; j++){
             int end = j;
             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
             if(maxSum < currSum){
                maxSum = currSum;
             } 
         }
        }
        System.out.println("max sum = " + maxSum);
     }

     public static void kadans(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.print("The maximum sub array sum is: " + ms);
     }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int key = 10;
       subarrSum(arr);
    }
}
