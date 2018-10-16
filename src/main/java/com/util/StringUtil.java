package com.util;


/**
 *
 * @author SBirmani
 */
public class StringUtil {
    
    public static boolean isNotEmpty(String input) {
        return !(input == null || input.trim().isEmpty() || "null".equalsIgnoreCase(input));
    }

    public static Integer[] extractIntegersArray(String source) {
        String[] integersAsText = source.split(",");
        Integer[] results = new Integer[integersAsText.length];
        int i = 0;
        for (String textValue : integersAsText) {
            results[i] = Integer.parseInt(textValue);
            i++;
        }
        return results;
    }

    public static String leftPadWithZeroes(String originalString, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String padding = sb.toString();
        String paddedString = padding.substring(originalString.length()) + originalString;
        return paddedString;
    }
    public static String trimVal(String input) {
        if((input != null && !input.trim().isEmpty() && !"null".equalsIgnoreCase(input))){
            return input.trim();
        }
        return null;
    }
    
    public static boolean isEqual(Object obj1, Object obj2){
        boolean isEqual = false;
        try{
            if((obj1 == null && obj2 == null) || (obj1 != null && obj1.equals(obj2))){
                isEqual = true;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return isEqual;
    }
}
