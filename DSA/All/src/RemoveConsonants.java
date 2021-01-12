public class RemoveConsonants {
    public static void main(String[] args){

        String name = "masai";
                remove(name);
    }
    public static void remove(String name){
        String consonantRemoval = "'";
        for(int i = 0; i < name.length(); i++){
            switch (name.charAt(i)){
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                    consonantRemoval = consonantRemoval + name.charAt(i);
                    break;
            }
        }
        System.out.println(consonantRemoval);
    }

}
