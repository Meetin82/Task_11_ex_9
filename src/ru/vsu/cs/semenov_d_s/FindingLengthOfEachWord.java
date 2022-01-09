package ru.vsu.cs.semenov_d_s;

public class FindingLengthOfEachWord {

    public String writeLengthOfEachWord(String text) {
        StringBuilder sb = new StringBuilder();
        String[] newText = text.split("[^A-Za-zА-Яа-я0-9]");

        for (int i = 0; i < newText.length; i++) {
            if (i == newText.length - 1) {
                sb.append(newText[i]).append("(").append(newText[i].length()).append(")");
            } else {
                sb.append(newText[i]).append("(").append(newText[i].length()).append(") ");
            }
        }

        return sb.toString();
    }
}
