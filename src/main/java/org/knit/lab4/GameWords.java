package org.knit.lab4;

public class GameWords {
    private char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();
    private int[] freq = new int[alphabet.length];

    public GameWords(char[] word) {
        getWordStat(word);
    }

    private void getWordStat(char[] wd) {
        for (char i: wd) {
            int index = getAlphabetIndex(i);
            if (index != -1) {
                freq[index]++;
            }
        }
    }

    private int getAlphabetIndex(char ch) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == ch) return i;
        }
        return -1;
    }
}
