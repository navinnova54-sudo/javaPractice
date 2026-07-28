package Day12;

public class Problem3 {
    public boolean is_palin(String s , int start ,int end)
    {
         while(start < end)
         {
            if(s.charAt(start)!=s.charAt(end))
            return false;
            start++;
            end--;
         }
         return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0 ,right = s.length()-1;

        while(left < right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return is_palin(s,left+1,right) || is_palin(s,left,right-1);
            }
        }
        return true;
    }
}

    
