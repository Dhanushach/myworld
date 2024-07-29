class Person 
{
// Attributes
String name;
int age;
//Constructor
public Person(String name, int age)
{
this.name = name;
this.age = age;
}
// Getters
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
// Main method to create an object and print attributes
public static void main(String[] args)
{
// Create an object of the Person class
Person person1 = new Person("Dhanusha", 18);
// Print the attributes of the object
System.out.println("Name: " + person1.getName());
System.out.println("Age: " + person1.getAge());
}
}