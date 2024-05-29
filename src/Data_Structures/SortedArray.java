package Data_Structures;

public class SortedArray {


    // search in a sorted array
    public static int binarySearch(int arr[], int low, int high, int key){

        if (high < low)
            return -1;

        int mid = (low + high)/2;
        if (key == arr[mid]){
            return mid;
        }
        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        int arr[] = {5,6,7,8,9,10};
        int n, key;
        n = arr.length;
        key = 10;

        System.out.println("Index of key element is: " +binarySearch(arr, 0, n-1, 10));
    }
}
