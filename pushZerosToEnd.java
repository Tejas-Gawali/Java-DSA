class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int[] temp = new int[n];
        int k = 0;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if( arr[i] == 0){
                count++;
            }
            else{
                temp[k++] = arr[i];
            }
        }
        
        for(int i = 0 ; i < n - count ; i++){
            arr[i] = temp[i];
        }
        
        int remarr = n - count;
        while(count>0){
            arr[remarr + count -1] = 0;
            count--;
        }
    }
}
