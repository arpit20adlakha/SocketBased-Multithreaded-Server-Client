package concepts;

import java.io.*;

public class FileWriting {


    public static void main(String[] args) {

        StringReader stringReader = new StringReader("Popchop mop");
        int[] a = {2, 4, 5};
//        Arrays.stream(a).forEach();
        File file = new File("./src/jdbc/new.txt");
// FileWriter and PrintWriter
        try(FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("How is this new file doing");
            fileWriter.write("Or how is this still getting appended");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (Reader reader = new FileReader(file)) {
            int i;
            while ( (i = reader.read()) != -1) {
//                char a = (char)i;
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
