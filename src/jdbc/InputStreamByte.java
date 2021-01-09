package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class InputStreamByte {
    final int p = 4;

    InputStreamByte(int a) {

    }

    InputStreamByte(int a, int b) {
        System.out.println(a);

    }



    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in); // 1
        final int a;// 2
        a = 4;
        final int v = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
        int m = v;                                          // 5
        System.out.println(c + 1);
        try(FileInputStream f = new FileInputStream("src/jdbc/new.txt")) {
            byte[] bytes = new byte[5];
            System.out.println(bytes[0]);
            int numberOfBytesRead = f.read(bytes);
            byte[] p = Arrays.copyOf(bytes, 5);
            while(bytes[0] != 0) {
                f.read(bytes);
                char[] chars = new char[5];
                int i = 0;
                for (byte b : bytes) {
                    chars[i++] = (char)b;
                }
                System.out.print(String.valueOf(chars));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
