package Test2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] a = {
				new Student(14069,"��**","����", 3), new Student(12051,"Ȳ**","�濵",4),
				new Student(15002,"��**","������",2), new Student(12481,"��**","����",4),
				new Student(15505,"��**","����",2), new Student(16962,"��**","����",1),
				new Student(15376,"��**","��ǻ��",2), new Student(16420,"��**","����",2),
				new Student(15505,"��**","��ǻ��",4), new Student(10184,"��**","�濵",3),
				new Student(15505,"��**","��ǻ��",1), new Student(10390,"��**","�濵",4),
				new Student(15505,"��**","��ǻ��",2)
			};
			Arrays.sort(a);	//  �й����� ����
			print(a,"ID");
			//�а��̸����� ���� Comparator WITH_DEPT
			Arrays.sort(a,Student.WITH_DEPT);
			print(a,"�а�");
			//�л��̸����� ���� Comparator WITH_NAME
			Arrays.sort(a,Student.WITH_NAME);
			print(a,"�̸�");
			//�г����� ���� Comparator WITH_GRADE
			Arrays.sort(a,Student.WITH_GRADE);
			print(a,"�г�");
	}
	private static void print(Student[] a, String string) {
	    for(Student  student : a) {
	       System.out.println(student.getID()+" " + student.getDept() +"   "+ student.getName() +"  "+ student.getGrade());
	    }
	}
}

