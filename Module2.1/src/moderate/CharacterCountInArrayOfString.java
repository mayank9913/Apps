package moderate;

public class CharacterCountInArrayOfString {
    public static void main(String[] args){
        int count= 0;
        String[] array = {"HTML", "CSS", "JAVA", "JS", "ANDROID"};
        for(int i =0; i<array.length; i++){
            for(int j= 0; j<array[i].length();j++){
                count++;

            }
        }
        System.out.println(count);
    }
}
