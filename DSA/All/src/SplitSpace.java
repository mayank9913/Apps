public class SplitSpace {
    public static void main(String[] args){
        String name = "Masai School is Awesome";
                String[] names = name.split( " ");
        for(int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
