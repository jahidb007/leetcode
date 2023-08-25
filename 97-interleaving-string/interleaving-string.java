class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

 boolean[][][] booleans = new boolean[s1.length()+1][s2.length()+1][s3.length()+1];
        return  isInterleaves(s1, s2, s3,booleans);


    }



     private  boolean isInterleaves(String s1, String s2, String s3,boolean[][][] booleans) {

        System.out.println(s3.length() +" "+ s1.length() + " "+ s2.length());
        boolean result = false;
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        if (s1.isEmpty() && s2.isEmpty() && s3.isEmpty()) {
            return true;
        }

        if(booleans[s1.length()][s2.length()][s3.length()] == true){
            return false;
        }


        if (!s1.isEmpty() && s1.charAt(0) == s3.charAt(0)) {
            System.out.println("a");
            booleans[s1.length()][s2.length()][s3.length()] = true;
            result = isInterleaves(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()),booleans);
        }
        if(!result) {
            if (!s2.isEmpty() && s2.charAt(0) == s3.charAt(0)) {
                booleans[s1.length()][s2.length()][s3.length()] = true;
                System.out.println("b");
                result = isInterleaves(s1,  s2.substring(1, s2.length()), s3.substring(1, s3.length()),booleans);
            }
        }



     /*   if (!s1.isEmpty() && s1.charAt(0) == s3.charAt(0)) {

            result = isInterleave(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()));


            if (result == true) {
                return result;
            } else if (!s2.isEmpty() && s2.charAt(0) == s3.charAt(0)) {
                result = isInterleave(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length()));
                if (result == true) {
                    return result;
                }

                return result;
            }


        } else if (!s2.isEmpty() && s2.charAt(0) == s3.charAt(0)) {
            result = isInterleave(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length()));
            if (result == true) {
                return result;
            }


        }*/

        return result;
    }
}