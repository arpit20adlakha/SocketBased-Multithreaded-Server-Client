package concepts;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class OutputStreams101 {

    public static void main(String[] args) {
        try {
            CharArrayWriter contactWriter = new CharArrayWriter();
            FileWriter bc1 = new FileWriter("bussiness_card_1.txt", true);
            FileWriter bc2 = new FileWriter("bussiness_card_2.txt", true);

            contactWriter.write("Phone: 111-222-333; Adresss: Nothing");
            contactWriter.writeTo(bc1);
            contactWriter.writeTo(bc2);

            char[] array = contactWriter.toCharArray();

            bc1.close();
            bc2.close();
            contactWriter.close();
        } catch (Exception e) {

        }
    }


}
