class Solution {
    int count(int[] arr, int n, int x) {
        int occ = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == x){
                occ++;
            }
        }
        return occ;
    }
}

// 

