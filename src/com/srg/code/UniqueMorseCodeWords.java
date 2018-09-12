package com.srg.code;

import java.util.HashSet;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMoreRepresentations(words));
    }

    private static int uniqueMoreRepresentations(String[] words) {
        String[] info = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> hashSet = new HashSet<>();
        for(String string : words){
            StringBuilder stringBuilder = new StringBuilder();
            for(Character character : string.toCharArray()){
                stringBuilder.append(info[character-'a']);
            }
            hashSet.add(stringBuilder.toString());
        }
        return hashSet.size();
    }
}
