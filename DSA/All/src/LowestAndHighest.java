public class LowestAndHighest {
    public static void main(String[] args){
        int[] scores = {56, 48, 30, 40, 45, 35};
        int lowest = scores[0];
        int highest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println(lowest);

        for (int j = 0; j > scores.length; j++) {
            if (scores[j] > highest) {
                highest = scores[j];
            }
        }
        System.out.println(highest);

    }

}
