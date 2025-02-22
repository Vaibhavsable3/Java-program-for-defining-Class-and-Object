// Define a simple class named 'Dog'
class Dog {
    // Attribute of the class
    String name;

    // Method of the class to set the name
    public void setName(String dogName) {
        name = dogName;
    }

    // Method to display the name of the dog
    public void displayName() {
        System.out.println("The dog's name is: " + name);
    }
}

public class ClassObj {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();

        // Set the name of the dog using the setName method
        myDog.setName("Buddy");

        // Display the name of the dog using the displayName method
        myDog.displayName();
    }
}
