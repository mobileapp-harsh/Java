package Operators;

public class ArithmeticOperator{
    public static void main(String args[]){
        int i1 = 30;
        int i2 = 26;
        float f1 = 12.05F;
        double d1 = 20.02;
        String name = "Harsh";
        byte b1 = 12;
        byte b2 = 25; 
        int addres1 = i1 + i2;
        float addres2 = i1 + f1;
        double addres3 = f1 + d1;
        String addres4 = name + f1;
        byte addres5 = (byte)(b1 + b2);
        byte addres6 = (byte)(b1 + 0);
        byte addres7 = 126 + 1;
        byte addres8 = (byte)(126 + 19);

        System.out.println("Addition");
        System.out.println(addres1);
        System.out.println(addres2);
        System.out.println(addres3);
        System.out.println(addres4);
        System.out.println(addres5);
        System.out.println(addres6);
        System.out.println(addres7);
        System.out.println(addres8);

        int subres1 = i1 - i2;
        float subres2 = f1 - i1;
        double subres3 = d1 - f1;
        byte subres4 = (byte)(b1 - b2);
        byte subres5 = (byte)(b1 - 0);
        byte subres6 = 126 - 1;
        byte subres7 = (byte)(126 - 19);
        System.out.println("Substraction");
        System.out.println(subres1);
        System.out.println(subres2);
        System.out.println(subres3);
        System.out.println(subres4);
        System.out.println(subres5);
        System.out.println(subres6);
        System.out.println(subres7);

        int mulres1 = i1 * i2;
        float mulres2 = f1 * i1;
        double mulres3 = d1 * f1;
        byte mulres4 = (byte)(b1 * b2);
        byte mulres5 = (byte)(b1 * 0);
        byte mulres6 = 126 * 1;
        byte mulres7 = (byte)(126 * 19);
        System.out.println("Multiplication");
        System.out.println(mulres1);
        System.out.println(mulres2);
        System.out.println(mulres3);
        System.out.println(mulres4);
        System.out.println(mulres5);
        System.out.println(mulres6);
        System.out.println(mulres7);

        int divres1 = i1 / i2;
        float divres2 = f1 / i1;
        double divres3 = d1 / f1;

        System.out.println("Division");
        System.out.println(divres1);
        System.out.println(divres2);
        System.out.println(divres3);
    }
}