import javax.sound.midi.Soundbank;

public class VowelCheck {
    public static void main(String[] args){
        char ch = 'A';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println( 'A'+ "  character is a vowel ");
                break;
            default:
                System.out.println("character is not a " +
                        "vowel");
        }











    }
}
