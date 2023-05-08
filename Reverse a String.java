class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String temp = "";
        char ch ;
        for(int i = str.length()-1 ; i >=0  ; i--){
            ch= str.charAt(i);
            temp += ch;
            
        }
        
        return temp;
        
    }
}
