public class OddCaracters {
    public static void main(String[] args){
        System.out.println("odd characters of ubuntu");
        String a = "ubuntu";
        for(int i=0; i<a.length(); i+=2){
            char current1 = a.charAt(i);
            System.out.println(current1);
        }
        System.out.println("odd characters of windows");
        String b = "windows";
        for(int i=0; i<b.length(); i+=2){
            char current2 = b.charAt(i);
            System.out.println(current2);
        }

    }

}
