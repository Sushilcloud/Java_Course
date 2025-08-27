public class Dog {

    private String name;
    private String color;

    public Dog(String name, String color)
    {
        // Initialize name with the provided parameter
       this.color=name;
        // Initialize color with the provided parameter
        this.name=color;
    }


    // Main method to test the Dog class
    public static void main(String[] args)
    {
        // Create a new Dog object using the parameterized constructor

      //  A new Dog object (myDog) is created using the parameterized constructor,
        //  passing "Buddy" and "Brown" as arguments.
        Dog myDog=new Dog("Ruby","white");
        // Print the values of the instance variables
        //Encapsulation: By keeping the instance variables private and initializing them through the constructor,
        // the class ensures that the variables are set only when a new object is created, promoting controlled initialization and data integrity.
        System.out.println("Name of the Dog="+myDog.name);
        System.out.println("color of the Dog="+myDog.color);
    }
}
