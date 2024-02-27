package algorithm_strategies.twopointer;

import java.util.HashMap;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "abc", t = "ahbgdc";

        int m = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {

            hashMap.put(t.charAt(i),i);
        }

        int prei = -1;

        for (char c : s.toCharArray()) {

            if (!hashMap.containsKey(c)){}
            int curi = hashMap.get(c);
            if (curi <= prei) {
            }
            prei = curi;
        }

    }


    public static boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;

        while (i <s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }


}
