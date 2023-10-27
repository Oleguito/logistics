package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Encrypt {
    public static void encrypt(String filename) {
        String contents = readFileContents(filename);
        char[] contentsArray = contents.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < contentsArray.length; i++) {
            result.append(encryptSymbol(contentsArray[i]));
        }
        // TODO...
    }
    
    static char encryptSymbol(char symbol) {
        return (char) (symbol + 255);
    }
    
    static char decryptSymbol(char symbol) {
        return (char) (symbol - 255);
    }
    
    private static String readFileContents(String filename) {
        String contents = "";
        String line;
        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                contents += line + "\n";
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException("Файл не существует либо ошибка чтения", e);
        }
        return contents;
    }
}
