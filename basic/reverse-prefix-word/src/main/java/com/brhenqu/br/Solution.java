package com.brhenqu.br;

class Solution {
    public String reversePrefix(String word, char ch) {
        // Get the index
        int index = word.indexOf(ch);

        // If the first char was not found return the original word
        if (index == -1) {
            return word;
        }

        // move the word for an array of characters
        char[] charArray = word.toCharArray();

        // reverse the array until the index is found
        int left = 0;
        int right = index;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // build the string
        return new String(charArray);
    }

    public static String reversePrefixExpensive(String word, char ch) {

        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        StringBuilder result = new StringBuilder();
        for (int i = index; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        for (int i = index + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }
}