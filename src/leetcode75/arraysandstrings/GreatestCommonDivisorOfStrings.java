package leetcode75.arraysandstrings;

public class GreatestCommonDivisorOfStrings {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String[] strs = {"flower", "flow", "flight"};

        String w = strs[0];
        int n = strs[1].length();







        for (int i = 1; i < strs.length; i++) {

            int x = strs[i].length();

            System.out.println(x);

            while (!(w.equals(strs[i].substring(0,x)))){


                sb.append(w.substring(0,x));

            }
        }

        System.out.println(sb.toString());

    }

    String str1 = "abcabc", str2 = "abc";

    public String gcdOfStrings(String str1, String str2) {
        int alen = str1.length(), blen = str2.length();
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        int rult = gcd(alen,blen);
        return str1.substring(0,rult);
    }
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
