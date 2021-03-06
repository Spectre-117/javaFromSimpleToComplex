package com.javaLessons.javaSimpleToComplex.chapterOne;

import java.util.ArrayList;
import java.util.Scanner;

public class IfPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str = "" + i;
        String result = "palindrome";
        for (int k = 0; k < str.length()/2; k++) {
            if (str.charAt(k) != str.charAt(str.length() - 1 - k)) {
                result = "not a palindrome";
                break;
            }
        }
        System.out.println(result);
        finishGame();

    }

    public static void finishGame() {
        ArrayList<String> al = new ArrayList<>();
        String str = "ghfd";
        al.add(str);

        String str2 = al.get(0);
        str2=null;
        al.add(str2);
        if (al.get(1)!=null&& al.get(0).equals("ghfd")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        int i =0;
        {
            i++;
        }
        i++;
        System.out.println(i);
    }
}
