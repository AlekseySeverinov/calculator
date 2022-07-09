import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter two numbers:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = 0, b = 0, result = 0;

            try {
                a = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error" + e.getLocalizedMessage());
            }

            try {
                b = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Error" + e.getLocalizedMessage());
            }

            System.out.println("Enter sing:");
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String sing = "";
            try {
                sing = read.readLine();
            } catch (IOException e) {
                System.out.println("Error" + e.getLocalizedMessage());
            }

            switch (sing) {
                case "+": {
                    result = a + b;
                }
                break;
                case "-": {
                    result = a - b;
                }
                break;
                case "*": {
                    result = a * b;
                }
                break;
                case "/": {
                    result = a / b;
                }
                break;
            }
            System.out.println("result:" + result);
        }
    }
}