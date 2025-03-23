//Ass 1
//Q.
import java.util.Scanner;

class prime
{
 public static void main(String args[])
 {
  Scanner input =new Scanner(System.in);
  System.out.println("Enter any Number :");
  
   int num=input.nextInt();
   int c=0;
  
    for(int i=1; i<=num; i++)
     {
     
      if(num%i==0)
      {
       c++;
      }
     }

  if(c==2)
   {
    System.out.println("Number is prime");
   }
  else
   {
  System.out.println("Number is not prime");
   }
 }
}
  //  Enter any Number :
  //  5
  //  Number is prime