
//***The Cat class is defined with the keyword class.
public class Cat {
    /*
    Write a Java program to create a class called “Cat” with instance
    variables name and age. Implement a default constructor that initializes
    the name to "Unknown" and the age to 0. Print the values of the variables.
     */
    //***The Cat class has two private instance variables: name (a String) and age (an int).
    private String name;
    private int age;



    //Default constructor:
    //***The default constructor Cat() is defined.
    //***Inside the default constructor, name is initialized to "Unknown".
    //***age is initialized to 0
    public  Cat()
    {
        // initilize name to "Unknow"
        this.name="Unknown";
        // Initilize age to 0
        this.age=0;

    }

    // Getter the name
    public String getName()
    {
        return name;
    }

    // Getter the age
    public int getAge()
    {
        return age;

    }

    //Main method:
    //***The main method is defined to test the Cat class.
    //***A new Cat object (myCat) is created using the default constructor.
    //***The values of the instance variables (name and age) are printed to the console

    public static void main(String[] args)
    {
        //Initialization: When a new Cat object is created, the default constructor is called automatically.
        //Setting Default Values: The constructor initializes the name to "Unknown" and the age to 0,
        // ensuring that these variables have default values when an object is created without
        // specific values provided.

        //Encapsulation: By keeping the instance variables private and initializing them through the
        // constructor,
        // the class ensures that the variables are always set to a known state when an object is created.
        Cat myCat=new Cat();
        System.out.println("Cat's Name"+myCat.getName());
        System.out.println("Cat's Name"+myCat.getAge());

    }
}
