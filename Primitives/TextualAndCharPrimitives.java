package Primitives;
public class TextualAndCharPrimitives{
    public static void main(String args[]){
        char c1 = 65;
        char c2 = 'A';
        char c3 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        char c4 = 8377;
        char c5 = '\u20B9';
        System.out.println(c4);
        System.out.println(c5);

        char c6 = 65535;
        System.out.println(c6);
    }
}