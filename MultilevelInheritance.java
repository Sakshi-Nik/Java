
//Ass 3, Q. 4

import java.io.*;

class Student{
	int rollno;
    void getRoll(int r)
	{
	this.rollno=r;	
	}
	
	void showRollno(){
		System.out.println("Roll no"+rollno);
	}
}

class Test extends Student{
	int sub1, sub2;
	void getMarks(int m1, int m2)
	{
	  this.sub1=m1;
      this.sub2=m2;	  
	}
    
	void showMarks()
	{
		System.out.println("Marks of Sub 1 :"+sub1);
		System.out.println("Marks of Sub 2 :"+sub2);
	}
}

class Result extends Test{
	int total;
	void displayResult()
	{
		total=sub1+sub2;
		System.out.println("Total Marks :"+total);
		System.out.println("Percentage :"+(total/2));
	}

}

class MultilevelInheritance{
	public static void main(String args[])
	{
		Result r = new Result();
		r.getRoll(65);
		r.showRollno();
		r.getMarks(44,79);
		r.showMarks();
		r.displayResult();
	}

}

/*Roll no65
Marks of Sub 1 :44
Marks of Sub 2 :79
Total Marks :123
Percentage :61*/