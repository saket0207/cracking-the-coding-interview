package com.planetj.arrays;

public class CompressString {

    public static void main(String[] args) {
        String str = "a";
        String compressedString = CompressString.compressString(str);
        System.out.println("Compressed String = " + compressedString);
    }

    private static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int countConsecutive = 0;
        for(int i = 0; i < str.length(); i++){
            countConsecutive++;
            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return sb.length() < str.length() ? sb.toString() : str;
//        return sb.toString();
    }

}
