import java.util.Scanner;         
public class array_programs {
	                                                                             
    
	                                                                
		Scanner sc=new Scanner(System.in);                                                                         
		public void largestand_smallest()                                                                          
		{                                                                                                          
	int n,min,max;                                                                                                 
	                                                                                                               
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
	public void Print_Even_No()                                                                                    
	                                                                                                               
	{                                                                                                              
		int i;                                                                                                     
		System.out.println("Enter limit");                                                                         
		int n=sc.nextInt();                                                                                        
		System.out.println("Even Numbers from 2 to" +n + " are");                                                  
		for(i=2;i<=n;i++)                                                                                          
		{                                                                                                          
			if(i%2==0)                                                                                             
			{                                                                                                      
				System.out.println(i);                                                                             
			}                                                                                                      
		}                                                                                                          
	}                                                                                                              
	}                                                                                                              
	                                                                                                               

