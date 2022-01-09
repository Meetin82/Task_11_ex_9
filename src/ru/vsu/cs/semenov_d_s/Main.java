package ru.vsu.cs.semenov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = readText();

        FindingLengthOfEachWord findingLengthOfEachWord = new FindingLengthOfEachWord();
        String textWithCountedWordLengths = findingLengthOfEachWord.writeLengthOfEachWord(text);

        printTextWithCountedWordLengths(textWithCountedWordLengths);
    }

    private static String readText() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the text for which you want to count word lengths: ");
        return scn.nextLine();
    }

    private static void printTextWithCountedWordLengths(String changedText) {
        System.out.println(changedText);
    }
}
