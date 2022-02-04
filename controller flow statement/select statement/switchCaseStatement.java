// public class switchCaseStatement {
//     public static void main(String args[]) {
//         int day = 5;

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thrusday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday")  ;
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;

//             default:
//                 System.out.println("Value is Noe available");
//                 break;
//         }
//     }
// }

public class switchCaseStatement {
    public static void main(String args[]) {
        byte var = 65;
        final byte a = 10;
        final byte b;
        b = 20;
        switch (var) {
            case a:
                System.out.println(1);
                break;
            case a * 5:
                System.out.println(2);
                break;
            default:
                System.out.println("This is over");
                break;
        }

    }
}