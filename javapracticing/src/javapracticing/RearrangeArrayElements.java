package javapracticing;

import java.util.*;

public class RearrangeArrayElements
{
public static void main(String[] args)
{
new RearrangeArrayElements().inputAcceptor();
}

public void inputAcceptor()
{
Scanner scan = new Scanner(System.in);

System.out.println("Enter the Size of Array : "); //Asking Size of Array
int SizeOfArray = scan.nextInt(); // Taking Size of Array
boolean SizeResult = new RearrangeArrayElements().inputArraySizeValidator(SizeOfArray);

if(SizeResult)
{
ArrayList<Integer> inputArray = new ArrayList<Integer>(); //Array Creation
System.out.println("Enter "+SizeOfArray+" Values : ");

try
{
for(int i=0;i<=SizeOfArray-1;i++)
{
inputArray.add(scan.nextInt()); //Taking Input Array values
}
}
catch(InputMismatchException h)
{
System.out.println("Only Integers Are Accepted"); 
}

ArrayList<Integer> TR= new ArrayList<>(inputArray);
boolean InputResult = new RearrangeArrayElements().inputArrayValidator(TR); 
if (InputResult==true)
{
System.out.println("Given array is in order : "+ inputArray); //Printing Result
}
else
{
ArrayList<Integer> ResultArray = computeRearrangedArray(inputArray);
new RearrangeArrayElements().displayResult(ResultArray);
}
}
else
System.out.println("Invalid Size");
scan.close();
}
public boolean inputArraySizeValidator(int size)
{
if(size<1)
return false;

return (Boolean) true;
}

public boolean inputArrayValidator(ArrayList<Integer> input)
{
int irr=input.size()/2;
for(int i=0;i<irr;i++)
{
int max = Collections.max(input);
System.out.println(max);
int min= Collections.min(input);
System.out.println(min);
System.out.println(i);
if(input.get(0)==max && input.get(1)==min)
{ 
	input.remove(0);
	System.out.println(input);
	input.remove(0);
	System.out.println(input);

	System.out.println("Remaining : " + input);
	}
	}

	if(input.size()==0)
	return true;
	else
	return false;
	}
public ArrayList<Integer> computeRearrangedArray(ArrayList<Integer> inputArray)
{
Collections.sort(inputArray);
ArrayList<Integer> RA= new ArrayList<Integer>();

int left =0;
int right = inputArray.size()-1;
while(left<=right)
{
RA.add(inputArray.get(right--));
if(left<=right)
RA.add(inputArray.get(left++));
}

return RA;
}
public void displayResult(ArrayList<Integer> outputArray)
{
System.out.println("The Sorted Array is : "+ outputArray);
}

}
