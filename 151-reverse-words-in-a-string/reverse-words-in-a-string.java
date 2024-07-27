import java.util.*;
class Solution {
    public String removeSpaces(String s) {
        return s.replaceAll("\\s+", " ").trim();
    }

    // Method to reverse words in a string
    public String reverseWords(String s) {
        // Remove extra spaces
        String str = removeSpaces(s);
        
        // Split the string by spaces
        String[] arr = str.split(" ");
        int n = arr.length;

        // Reverse the words in the array
        int start = 0, end = n - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Join the reversed words back into a single string
        String result = String.join(" ", arr);
        return result;
    }
}