package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String sentence = "My name is Atidzhe.";

	Scanner secondChange = new Scanner(System.in);
	String secondChange2 = secondChange.nextLine();
	//String replaceTheString = secondChange2;
	String modifiedSentence = sentence.replace("Atidzhe", secondChange2);

	//String change = sentence.replace("Atidzhe", "Kestendzhieva");
	System.out.println(modifiedSentence);
	
    }
}
