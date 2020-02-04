import java.util.Scanner;

public class Controller {

	  public static void start() {
	        fillPeopleShelter();

	    }
	  private static Strudent[] student;
	  private static Teacher[] teacher;

	private static void fillPeopleShelter() {
		int numberStudent;
		int numberTeacher;
		Scanner scr = new Scanner(System.in);
		
		System.out.println("How many students do u have?");

		numberStudent = scr.nextInt();
		
		student = new Strudent[numberStudent];
		System.out.println("How many teachers do u have?");
		
		numberTeacher =scr.nextInt();
		teacher = new Teacher[numberTeacher];
		String name;
		int cute;
		Shelter shelter = new Shelter();
		for (int i = 0; i < student.length; i++) {
			System.out.println("Please write the name of student: ");
			name = scr.next();
			System.out.println("age");
			cute = scr.nextInt();
			student[i] = new Strudent(name,cute);
			shelter.Add(student[i]);
			
		}
		System.out.println("Student number : "  + numberStudent);
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("Please write the name of teacher: ");
			name = scr.next();
			System.out.println("age");
			cute = scr.nextInt();
			teacher[i] = new Teacher(name,cute);
			shelter.Add(teacher[i]);
			
		}
		
		shelter.printPeople();
		
		String sname;
		
		System.out.println("Write the name : ");
		sname = scr.next();
		People p = shelter.searchPeople(sname);
		System.out.println(p.getAge() + " " + p.getName());
		
		
		
		
		
	}
}
