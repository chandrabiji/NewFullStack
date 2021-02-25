package oops;

class Course
{
	public int cid;
	public String cname;
	public String duration;
	public double fees;
	public Course(int cid, String cname, String duration, double fees) {
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}
	
}
class Student
{
	public int sid;
	public String sname;
	public Course course;
	public Student(int sid, String sname, Course course) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}
	
}

public class AssociationDemo {

	public static void main(String[] args) {
		Course c1 = new Course(1,"Java","80 Hours",18000);
		Student s1 = new Student(100,"Chandra",c1);
		System.out.println("Student Id   : "+s1.sid);
		System.out.println("Student Name : "+s1.sname);
		System.out.println("Course Name  : "+s1.course.cname);
		System.out.println("Course Duration : "+s1.course.duration);
		System.out.println("Course Fees     : "+s1.course.fees);

	}

}
