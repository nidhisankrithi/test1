import java.util.Scanner;

public class largest_and_smallest {
	public void largestand_smallest()
	{
int n,min,max;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in an array");
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("Enter elements in an array");
 for(int i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
	 
 }
 System.out.println("Array Elements are ");
 for(int i=0;i<n;i++)
 {
	 
	 System.out.println(a[i]);
	 
 }
 max=a[0];
 min=a[0];
 
 for(int i=0;i<n;i++)
 {
	 
	 if(a[i]>max)
	 {
		 max=a[i];
	 }
	 
 }
 System.out.println("Max value in an array is:" +max);
 
 
 for(int i=0;i<n;i++)
 {
	 
	 if(a[i]<min)
	 {
		 min=a[i];
	 }
	 
 }
 System.out.println("Max value in an array is:" +min);
	}

//Even or odd
public void even_or_odd()
{
	
System.out.println("Enter aqny number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%0==2)
{
	System.out.println("Number is Even");
}
else
{
	System.out.println("Number is odd");
}
}
}
