class Solution {
    
    
    public void segregateElements(int arr[], int n)
    {
        int s = 0;
        int e  = n - 1;
        int k = 0;
        int j = n-1;
        int[] temp = new int[n];
        
        while(s < n){
            if(arr[s] > 0){
                temp[k++] = arr[s];
            }
            if(arr[e] < 0){
                temp[j--] = arr[e];
            }
            
            s++;
            e--;
            
        }
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = temp[i];
        }
        
    }
    
}
