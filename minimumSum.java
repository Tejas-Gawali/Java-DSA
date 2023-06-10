class Solution {
    public int minimumSum(int num) {
        int s[] = new int[4];
        
        for(int i = 0; i <4 ; i++){
            s[i] = num %  10;
            num = num / 10;
        }

        Arrays.sort(s);
        int n1 = s[0] * 10 + s[3];
        int n2 = s[1] * 10 + s[2];

        return n1 + n2;
    }
}
