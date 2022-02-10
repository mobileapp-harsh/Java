package Arrays;
public class enhanceForLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        char[][] values = {
                { 'a', 'A' },
                { 'b', 'B' },
                { 'c', 'C' },
                { 'd', 'D' },
                { 'e', 'E' },
        };
        for (int x : arr) {
            System.out.println(x + 1);
        }
        for(char [] row : values){
            for(char val : row){
                System.out.println(val);
            }
        }
    }
}