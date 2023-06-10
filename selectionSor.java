class Solution
{
	
	
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0 ; i < n ; i++){
	        int small = i;
	        for(int j = i ; j < n ; j++){
	            if(arr[j] < arr[small]){
	                small = j;
	            }
	            
	        }
	        
	        
	        int temp = arr[i];
	        arr[i] = arr[small];
	        arr[small] = temp;
	    }
	}
}
