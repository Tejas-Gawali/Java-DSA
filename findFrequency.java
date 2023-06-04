class Solution{
    int findFrequency(int A[], int x){
        
        int n = A.length;
        int freq = 0;
        for(int i = 0; i < n ; i++){
            if(A[i] == x){
                freq++;
            }
        }
        return freq;
        
    }
}
//
