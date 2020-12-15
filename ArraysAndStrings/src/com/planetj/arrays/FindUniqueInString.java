package com.planetj.arrays;

public class FindUniqueInString {

    public static void main(String[] args) {

        String words = "amnesia";
        System.out.println("Is unique = " + FindUniqueInString.findIfUnique(words));

    }
    public static boolean findIfUnique(String words){

        String character = "";
        String duplicate = "";
        for(int  i = 0; i < words.length(); i++){

            if(character.contains("" + words.charAt(i))){
               duplicate += "" + words.charAt(i);
               return false;
            }else{
                character += "" + words.charAt(i);
            }
        }
        return true;
    }
}
