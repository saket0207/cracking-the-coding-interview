package com.planetj.arrays;

public class ReplaceSpaceInStringWithURLEncoding {

    public static void main(String[] args) {

        String inputStr = "Mr John Smith    ";
        String newString = ReplaceSpaceInStringWithURLEncoding.replaceSpaceInString(inputStr, 13);
        System.out.println(newString);
        System.out.print(newString.length());
    }

    private static String replaceSpaceInString(String inputStr, int length) {
        char [] strArr = inputStr.trim().toCharArray();
        int spaceCount = 0, newLength = 0;

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i] == ' ') {
                spaceCount++;
            }
        }
        newLength = length + 2 * spaceCount;

        char[] newStrArr = new char[newLength];

        for(int i = length - 1; i >= 0; i--){

            if(strArr[i] == ' '){
                newStrArr[newLength-1] = '0';
                newStrArr[newLength-2] = '2';
                newStrArr[newLength-3] = '%';
                newLength -= 3;

            }else{
                newStrArr[newLength - 1] = strArr[i];
                newLength--;
            }

        }
        return String.valueOf(newStrArr);

    }
}
