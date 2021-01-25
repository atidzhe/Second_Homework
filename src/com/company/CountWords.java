package com.company;

public class CountWords {

    public static void main(String[] args) {

        String phrase = "Maria lives in London";
        System.out.println(phrase.split(" ").length);

        int ans= phrase.split(" ").length;
        System.out.println(ans);
    }
}
