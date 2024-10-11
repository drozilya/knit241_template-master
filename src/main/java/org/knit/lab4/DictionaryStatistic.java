package org.knit.lab4;

import java.util.Random;

public class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // маскимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private char[] alphabet; // буквы алфавита
    private int[] frequency; //частота букв в словаре (в кадой ячейке хранит частоту букв, а индрес - это позиция буквы в alpabet)

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
    }

    // получить случайное слово из словаря
    public String getRandomWord() {
        int rnd = new Random().nextInt(words.length);
        return words[rnd];
    }

    public void printSymbolsStat() {
        /*
                Выведите количество встречающихся букв:
                Пример
                а - 100
                б - 10
                в - 12
                ...
                я - 1
         */
    }

}