//Ass 2
//Q.2
import java.util.Scanner;

class Area{
  float length;
  float breadth;

  void setDim(float l, float b)
 { 
  this.length=l;
  this.breadth=b;
 }

 float getArea()
 {
  return length*breadth;
 }
  
 }

 class RecArea{
 public static void main(String args[])
 {
  Scanner input= new Scanner(System.in);
   System.out.println("Enter lengh and breadth of Rectangle :");
   float length = input.nextFloat();
    float breadth= input.nextFloat();
  Area a = new Area();

  a.setDim(length,breadth);
  System.out.println("Area :"+a.getArea());
}}

/*Output
 Enter lengh and breadth of Rectangle :
4
6
Area :24.0
*/