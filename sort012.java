class Solution
{
    public static void sort012(int a[], int n)
    {
        int zeroes=0 ;
        int ones = 0;
        int twos = 0;
        
        for(int i = 0; i < n ; i ++ ){
            
            if(a[i] == 0){
                zeroes++;
            }
            
            if(a[i] == 1){
                ones++;
            }
            
            if(a[i] == 2){
                twos++;
            }
            
        }
        
        int i =0;
        
        while(zeroes>0){
            a[i++] = 0;
            zeroes--;
        }
        
        while(ones>0){
            a[i++] = 1;
            ones--;
        }
        
        while(twos>0){
            a[i++] = 2;
            twos--;
        }
    }
}
