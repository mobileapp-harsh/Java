package Arrays;
public class primitiveArray {
    public static void main(String args[]) {
        int[] scores;
        scores = new int[4];

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        scores[0] = 85;
        scores[1] = 65;
        scores[2] = 75;
        scores[3] = 65;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

    }
}