class Solution {
    public boolean isSubsequence(String s, String t) {
         if(s.equals(t)){
            return true;
        }

        if(s.isEmpty()){
          return true;
        }

        if(s.length() > t.length()){
            return false;
        }

        int l = s.length();
        int m = 0;
        int idx = 0;

        for(Character c : s.toCharArray()){
           for(int i = idx; i < t.length() ; i++){
               if(c == t.charAt(i)){
                   m++;
                   idx = i+1;
                   break;
               }

               if(idx >= t.length()){
                   if(m == s.length()){
                       return true;
                   }else return false;
               }


           }

            if(m == s.length()){
                return true;
            }
        }

return false;

    }
}