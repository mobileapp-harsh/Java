package Operators;

public class UnaryOperator{
    public static void main(String args[]){
        int i1 = +10;
        int i2 = 10;
        int i3 = -100;
        int i4 = -(i1+i2);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        int i5 = 25;
        System.out.println(++i5);
        System.out.println(--i5);
        System.out.println(i5++);
        System.out.println(i5--);
    }
}