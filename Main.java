public class Main {

    public static void main(String[] args) { 
        Person male = new Person();
        male.name ="João";
        male.age = 12;
        Person female = new Person();
        female.name = "Maria";
        female.age = 10;
        System.out.println("Male name: " + male.name + " age: " + male.age);
        System.out.println("Female name: " + female.name + " age: " + female.age);
    }
}