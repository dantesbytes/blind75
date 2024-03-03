package strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {





    }


    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String lp = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String cur = strs[i];

            while (!cur.startsWith(lp)) {

                if (lp.length() > 0) {

                    lp = lp.substring(0,lp.length()-1);
                } else {
                    break;
                }
            }
        }

        return lp;

    }
}
