package Day_1;

public class WriteClass {
    public static void main(String[] args) {
        System.out.println("Day 1");
        System.out.println("Lengths of args : "+args.length);
        System.out.println(args);
        for (String arg: args) {
            System.out.println(arg);
        }

        Dog aungNet = new Dog();
        aungNet.name="Aung Net";
        aungNet.greet();

        System.out.println("Hi! I am Aung Net");

        Dog goteKyar = new Dog();
        goteKyar.name="Gote Kyar";
        goteKyar.greet();

    }
}

class Dog {
    String name;
    void greet(){
        System.out.println("Hi! I am " + name);
    }
}
