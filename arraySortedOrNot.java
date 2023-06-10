class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        boolean ans = true;
        for(int i = 0 ; i < n-1 ; i ++){
            if(arr[i] > arr[i+1]){
                ans =  false;
                break;
            }
        }
        return ans;
    }
}
