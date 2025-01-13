package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

<<<<<<< HEAD
    public Dog(String dogName) {
=======
    public Dog(String dogName, int age) {
>>>>>>> 952f3f7a14ce2ef8f20c86db59cea8ef22125ea3

        this.dogName = dogName;
        this.age = age;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
>>>>>>> 952f3f7a14ce2ef8f20c86db59cea8ef22125ea3
}