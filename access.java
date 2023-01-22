public class access {

    public static void main(String[] args) {

        Person frodo = new Person("Frodo", 51, "with ring");
        frodo.displayInfo();

        Person sam = new Person("Sam", 53, "with salt");
        sam.displayInfo();

        Person pippin = new Person("Peregrin", 50, "fools Took");
        pippin.displayInfo();

        Person mery = new Person("Meriadok", 53, "exquaire of Rohan");
        mery.displayInfo();
    }

}
class Person{
    String name;
    int age;
    String addinfo;

    Person(String n, int a, String add){
        name = n;
        age = a;
        addinfo = add;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\nAdd info: %s \t", name, age, addinfo);
    }
}