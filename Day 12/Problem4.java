public class Problem4 {
     public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;
        int s_hash[] = new int[26];
        int t_hash[] = new int[26];

        int itr;
        for(itr=0;itr<s.length();itr+=1)
        {
            s_hash[s.charAt(itr) - 'a']++;
            t_hash[t.charAt(itr) - 'a']++;
        }

        for(itr=0;itr<26;itr+=1)
        {
            if(s_hash[itr] != t_hash[itr])
               return false;
        }
        return true;

    }
}
