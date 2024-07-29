package javapracticing;
public class Rectangle 
{
int length;
int width;
public void calculateArea()
{
double Area;
Area = length * width;
System.out.println(Area);
}
public void calculatePerimeter()
{
double Perimeter;
Perimeter = 2 * (length + width);
System.out.println(Perimeter);
}
public static void main(String[] args)
{
Rectangle R = new Rectangle(); 
R.length = 2;
R.width = 3;
R.calculateArea();
R.calculatePerimeter();
}
}