public class breakBranchingStatement {
    public static void main(String args[]) {
        int breakPoint = 20;
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
            if (i == breakPoint) {
                break;
            }
        }
    }
}