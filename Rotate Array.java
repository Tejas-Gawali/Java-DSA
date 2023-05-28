
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        
        if (d == 0)
            return;
            
            
        d = d % n;
        reverseArray(arr,0 , d - 1 );
        reverseArray(arr,d , n -1 );
        reverseArray(arr, 0 , n -1 );
        
        
    }
    
    static void reverseArray(int arr[] , int start , int end){
        while(start< end){
            int temp ;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
//
