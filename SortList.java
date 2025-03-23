//Ass 1
//Q. 
import java.io.*;


class A{
  public static void main(String args[])
  
  {
   int[] n={4,5,6,1,8,2,9};
   int i,j,temp;
	
	for(i=0; i<7; i++)
	{
	    for(j=i+1 ; j<7; j++)
		{
	    	if(n[i] > n[j])
	    	{
	    		temp = n[i];
	    		n[i] = n[j];
			n[j]=temp;
			}
		}
		System.out.print("pass "+(i+1)+":"+" ");
	          for(j=0; j<7; j++)
	           {
			   System.out.print(n[j]+" ");
	 	    
	           }
  System.out.println();
	}
	
	 System.out.println();
	 System.out.println("Sorted list in asending order");
	for(i=0; i<7; i++)
	{
	System.out.print(n[i]+" ");
	    
	}
  
  }
    
}
/*OutputDeviceAssignedpass 1: 1 5 6 4 8 2 9
pass 2: 1 2 6 5 8 4 9
pass 3: 1 2 4 6 8 5 9
pass 4: 1 2 4 5 8 6 9
pass 5: 1 2 4 5 6 8 9
pass 6: 1 2 4 5 6 8 9
pass 7: 1 2 4 5 6 8 9

Sorted list in asending order
1 2 4 5 6 8 9*/

	