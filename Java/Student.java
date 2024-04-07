/*8. Create a student class with the following data members:- rollNo, Name,
Course, Mark, grade, result. Develop function members to
a. assign values for rollNo, name, course and mark.
b. Find out the grade for the student(if mark &gt;90, then grade is A, if
mark is between 80 and 90, then grade is B, if mark is between 70
and 80, then grade is C, if mark is between 60 and 70, then grade
is D, otherwise, grade is F.
c. Find the result of the student. If mark&gt;60*/

package Java;

public class Student {
	
		private int rollNo;
		private String Name;
		private String Course;
		private int Mark;
		private char grade;
		private String result;

		public Student(int rollNo, String name, String course, int mark) {

		this.rollNo = rollNo;
		this.Name = name;
		this.Course = course;
		this.Mark = mark;

		}

		public void calGrade() {
		if (Mark > 90)
		grade = 'A';

		else if (80 <= Mark || Mark <= 90)
		grade = 'B';

		else if (70 <= Mark || Mark <= 80)
		grade = 'C';

		else if (60 >= Mark || Mark <= 70)
		grade = 'D';

		else
		grade = 'F';

		}
		public void getResult()
		{
		if(Mark>=60)
		{
		System.out.println("Result= Pass");
		}
		else
		{
		System.out.println("Result= Fail");
		}
		}
		public void display()
		{
		System.out.println("Roll No="+rollNo);
		System.out.println("Student name="+Name);
		System.out.println("Course name="+Course);
		System.out.println("Marks="+Mark);
		System.out.println("Grade="+grade);

		}
		
		}



