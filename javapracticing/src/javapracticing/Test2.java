package javapracticing;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test2 
{
public final void divideNumbers(int a, int b) 
{
a = 23;
b = 15;
}
public static void main(String[] args) 
{
try (Scanner S = new Scanner(System.in))
{
System.out.println("Enter a:");
int a = S.nextInt();
System.out.println("Enter b:");
int b = S.nextInt();
if (b == 0) 
{
System.out.println("Division by zero is not allowed.");
} else {
int z = a / b;
System.out.println("Division result: " + z);
}
} catch (InputMismatchException e) {
System.out.println("Invalid input. Please enter integers only.");
} catch (ArithmeticException e) {
System.out.println("Arithmetic error: " + e.getMessage());
} finally {
System.out.println("Program has ended.");
}
}
}

