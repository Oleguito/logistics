package service;


import entities.Encrypt;

import java.util.Scanner;

public class Service {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void addUser(){
        getUserInputString("Введите ваши имя, фамилию и отчество: ");
    }
    
    private static String getUserInputString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return "";
    }
}
