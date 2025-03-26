package Neetcode.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isValid("0P"));
    }
    public static boolean isValid(String s) {
        s = s.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        StringBuilder str = new StringBuilder(s.strip());
        str.reverse();
        String strToCompare = str.toString().toLowerCase();
        System.out.println(strToCompare);
        System.out.println(s);


        if (strToCompare.equals(s.strip())) {
            return true;
        }



        return false;
    }

}
