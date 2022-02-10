public class classAndObject {
    public String name;
    public int age;
    public String breed;
    public String color;

    public void bark() {
        System.out.println(name + ": is barking. ");
    }

    public void eat() {
        System.out.println(name + ": is eat. ");
    }

    public void wangTail() {
        System.out.println(name + ": is wangTail. ");
    }

    public static void main(String[] args) {
        classAndObject c1 = new classAndObject();
        c1.name = "Dog";
        c1.age = 20;
        c1.breed = "Poodle";
        c1.color = "red";

        c1.bark();
        c1.eat();
        c1.wangTail();

    }

}