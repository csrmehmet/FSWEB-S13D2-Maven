package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;  // Negatif sayılar için pozitif olarak kontrol edelim
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Sayıyı tersine çevir
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        // Orijinal sayı ile ters çevrilmiş sayı karşılaştırılır
        return originalNumber == reversedNumber;
    }
    public  static boolean isPerfectNumber(int number){
    if(number<1){
        return false;
    }
    int sum=0;
    for(int i=1;i<=number/2;i++){
        if(number%i==0){
            sum+=i;
        }
    }
    return sum==number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        StringBuilder wordOutput = new StringBuilder();

        while (number > 0) {
            int lastDigit = number % 10;
            wordOutput.insert(0, getWordForDigit(lastDigit) + " ");
            number /= 10;
        }

        return wordOutput.toString().trim();
    }

    private static String getWordForDigit(int digit) {
        return switch (digit) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> ""; // Bu duruma asla girmez
        };
    }
    }

