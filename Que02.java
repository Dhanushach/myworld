package javaassignments;
import java.util.Scanner;
public class Que02 
{
public static void main(String[] args)
{
Scanner scanner= new Scanner(System.in);
System.out.println();
int numb = scanner.nextInt();
int digit;
int sum=0;
int num = numb;
int reverse = 0,
rem;
int initialNum = num;
while (num!=0) {
rem= num%10;
reverse = reverse * 10 + rem;
num/=10 ;
}
if (initialNum != reverse) {
System.out.println(" ' "+num +" is not palindrome' ");
}
else {
while (initialNum>0) {
digit=initialNum%10;
initialNum=initialNum/10;
if(digit%2 == 0)
sum=sum+digit;
}
if(sum>25)
System.out.println(" ' "+numb+" is palindrome and the sum of even numbers is greater than 25' ");
else{
System.out.println(" ' "+numb+" is palindrome and sum of even numbers is less than25' ");}
}
scanner.close();
}
}