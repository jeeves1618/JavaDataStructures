import java.util.Scanner;

public class CeaserCipher{

    public CeaserCipher(int secretCode){
        char[] encoderText;
        encoderText = new char[26];
        char[] decoderText;
        decoderText = new char[26];

        char text1 = 'a';
        char text2 = 'a' + 1;

        for(int counter = 0;counter<26;counter++){
            encoderText[counter] = (char)('a' + ((secretCode + counter) % 26));
            decoderText[counter] = (char)('a' + ((secretCode - counter + 26) % 26));
        }

        System.out.println("The encoder text is : " + String.valueOf(encoderText));
        System.out.println("The decoder text is : " + String.valueOf(decoderText));
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        System.out.println(inputText);
        CeaserCipher c1 = new CeaserCipher(5);
    }
}