class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int sum = 0;
        
        for(int i = 0 ; i< n ; i++){
            for(int j = i ; j < n ; j++ ){
                sum+= arr[j];
                if(sum == s){
                    list.add(1);
                    list.add(2);
                    break;
                }
            }
            
        }
        
        
        return list;
    }
}
