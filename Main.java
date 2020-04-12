package Test2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] a = {
				new Student(14069,"박**","수학", 3), new Student(12051,"황**","경영",4),
				new Student(15002,"백**","디자인",2), new Student(12481,"박**","수학",4),
				new Student(15505,"장**","영문",2), new Student(16962,"정**","수학",1),
				new Student(15376,"최**","컴퓨터",2), new Student(16420,"진**","경제",2),
				new Student(15505,"김**","컴퓨터",4), new Student(10184,"강**","경영",3),
				new Student(15505,"김**","컴퓨터",1), new Student(10390,"한**","경영",4),
				new Student(15505,"이**","컴퓨터",2)
			};
			Arrays.sort(a);	//  학번으로 정렬
			print(a,"ID");
			//학과이름으로 비교할 Comparator WITH_DEPT
			Arrays.sort(a,Student.WITH_DEPT);
			print(a,"학과");
			//학생이름으로 비교할 Comparator WITH_NAME
			Arrays.sort(a,Student.WITH_NAME);
			print(a,"이름");
			//학년으로 비교할 Comparator WITH_GRADE
			Arrays.sort(a,Student.WITH_GRADE);
			print(a,"학년");
	}
	private static void print(Student[] a, String string) {
	    for(Student  student : a) {
	       System.out.println(student.getID()+" " + student.getDept() +"   "+ student.getName() +"  "+ student.getGrade());
	    }
	}
}

