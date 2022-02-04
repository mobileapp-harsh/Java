public class ifElseIfElseStatement {
    public static void main(String args[]) {
        byte hour = 16;
        if (hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 15) {
            System.out.println("Good Afternoon");
        } else if (hour >= 15) {
            System.out.println("Good Evening");
        }
    }
}