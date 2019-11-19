package com.kodilla.stream.beautifier;

import static java.lang.String.valueOf;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(string);
        System.out.println(result);
    }

    public static String invertString(String string){
        char[] charsOfString = string.toCharArray();
        char[] tempChar = new char[charsOfString.length];
        for (int i = 0; i < tempChar.length; i++){
            tempChar[tempChar.length -1 - i] = charsOfString[i];
        }
        return valueOf(tempChar);
    }

    public static String replaceChar(String string){
        return string.replace('r', '#');
    }
}
