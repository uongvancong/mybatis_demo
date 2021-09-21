package main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import config.AppConfig;
import entity.Student;
import service.StudentService;

public class StudentTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService studentService = (StudentService) context.getBean("studentService");

		// create student
		Student student1 = new Student("Cong", "Java Dev", 95, 987863217, "cong@gmail.com");
 	

		// insert student
//		studentService.insertStudent(student1);
//		System.out.println("insert : " + student1);
 
		
		// select all student
//		List<Student> listStudents = studentService.selectAllStudent();
//		System.out.println("select all : ");
//		for (Student student : listStudents) {
//			System.out.println(student);
//		}
		
		// select student by id
 		Student student3 = studentService.selectStudentById(2);
//		System.out.println(student3.toString());
		
		// update student
		student3.setPercentage(99);
		studentService.updateStudent(student3);
		System.out.println("update : " + student3);
		
		// delete student by id
		studentService.deleteStudentById(student3.getId());
		System.out.println("delete : " + student3); /**/
	}
}
