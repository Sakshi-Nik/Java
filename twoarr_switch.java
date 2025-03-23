//Ass 1
//Q.
import java.io.*;
import java.util.Scanner;

class twoarr_switch
{
	public static void main(String args[])
	{
    int i,j;
	Scanner input = new Scanner(System.in);
    int[][]a = new int[2][2];
	int[][]b = new int[2][2];
	int[][]result = new int[2][2];

   
    System.out.println("Enter elements of array a:");
    for(i = 0; i < 2; i++) 
	{
        for(j = 0; j < 2; j++) 
		{
            a[i][j]=input.nextInt();
        }
    }

    
     System.out.println("Enter elements of array b:" );
    for(i = 0; i < 2; i++) 
	{
        for(j = 0; j < 2; j++) 
		{
            b[i][j]=input.nextInt();
        }
    }

    int option;

    
    System.out.println("Matrix operation:");
    System.out.println("1. Addition" );
    System.out.println("2. Subtraction" );
    System.out.println("3. Multiplication");
    System.out.println("4. Upper Triangular Matrix" );
    System.out.println("5. Lower Triangular Matrix" );
    System.out.println("6. Transpose" );

    
     System.out.println("Enter option between 1 to 6: ");
     option=input.nextInt();

    switch(option) {
    case 1:
       
        System.out.println("Addition:" );
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                 System.out.print(a[i][j] + b[i][j]+" ");
              }
           
        }
        break;

    case 2:
       
       System.out.println ("Subtraction:");
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
               System.out.print(a[i][j] - b[i][j]+" ");
            }
          
        }
        break;

    case 3:
        
        System.out.println("Multiplication:" );
        
        
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                result[i][j] = 0;  
            }
        }

        
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

       
        for(i = 0; i < 2; i++) {
            for(j = 0; j < 2; j++) {
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
        break;
        
        
        
        	case 4:
		System.out.println(" Upper Triangular Matrix");
			 for ( i = 0; i < 2; i++) 
			   {
                 for ( j = 0; j < 2; j++) 
				 {
                  if (j < i)
                   System.out.println("0 ");  
                  else
                   System.out.println (a[i][j]);
                 }
             System.out.println();
               }
               
	
           break;
          
          case 5:
          	System.out.println ("Lower Triangular Matrix");
          	 for ( i = 0; i < 2; i++) 
			   {
                 for (j = 0; j < 2; j++) 
				 {
                  if (j > i)
                   System.out.println("0 ");  
                  else
                    System.out.println(a[i][j]);
                 }
             System.out.println();
               }
               
            break;
            
            case 6:
            System.out.println("Transpose of Matrix:");
             for ( i = 0; i < 2; i++)
			 {
               for ( j = 0; j < 2; j++) 
			   {
                System.out.println(a[j][i] );
               }
              System.out.println();
             }
             break;
       

    default:
       System.out.println( "Invalid option!");
        break;
    }  
}
}

/*Output:
Enter elements of array a:
4 3 5 6
Enter elements of array b:
1 2 7 8
Matrix operation:
1. Addition
2. Subtraction
3. Multiplication
4. Upper Triangular Matrix
5. Lower Triangular Matrix
6. Transpose
Enter option between 1 to 6:
1
Addition:
5 5 12 14*/
