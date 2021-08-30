import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
        StringBuilder builder = new StringBuilder();
        for (String w : args){
            builder.append(w.toLowerCase()).append(" ");
        }
        String chiffre = builder.toString();

        for (int i = 1; i <=26; i++) {
            byte[] newWord = chiffre.getBytes(StandardCharsets.US_ASCII);
            for (int j= 0; j<newWord.length; j++) {
                byte c = newWord[j];
                //97 - 122 = a - z
                if (c != ' ') {
                    byte x = (byte) (c - 97);
                    x = (byte) ((x + i) % 26);

                    newWord[j] = (byte) (97 + x);
                }
            }
                System.out.println(i + " : " + new String(newWord, StandardCharsets.US_ASCII));


        }
    }
}
