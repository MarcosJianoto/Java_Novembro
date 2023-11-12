import java.util.Locale;
import java.util.Scanner;

import entities.Departments;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department's name: ");
        String name = sc.nextLine();

        sc.close();

    }
}
