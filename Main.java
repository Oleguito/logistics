import service.Service;

import java.util.Scanner;

class O {
    static int a;
    void non_static_func() {
        System.out.println("This is non-static func");
    }
    static void static_func() {
        System.out.println("This is static func");
    }
}

public class Main {
    
    /* Написать функцию которая принадлежит классу Main и возвращает пароль пользователя в виде строки */
    
    public static String getPassword() {
        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        while(!password.matches(".+")) {
            System.out.println("Пароль неверный");
            password = scanner.nextLine();
        }
        return password;
    }
    
    public static void main(String[] args) {
        
        String s = getPassword();
        
        Service.addUser();
        
        // O object = new O();
        // object.non_static_func();
        //
        // O.static_func();
        
        // Menu.run();
        // System.out.println(Encrypt.encryptString("Boo"));
        // Encrypt.writeFile("sfddf.txt","sldkfjsdl;kf");
        // Encrypt.decryptFile("filename.txt");
        // Class c = entities.UserFields.class;
        // for (Field f : c.getDeclaredFields()) {
        //     System.out.println(f.getType());
        // }
    }
    
    
}
