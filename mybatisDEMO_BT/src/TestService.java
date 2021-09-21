
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import entity.Subject;
import serviceImpl.StudentServiceImpl;
import serviceImpl.SubjectServiceImpl;

public class TestService {
	public static void main(String[] args) {

		StudentServiceImpl service = new StudentServiceImpl();
		SubjectServiceImpl serviceSJ = new SubjectServiceImpl();
		Student tmp = new Student("Minh", "30");
		List<Student> tmpList = new ArrayList<>();
		List<Subject> tmpListSJ = new ArrayList<>();

		Subject tmpSJ = new Subject("toan");
// test insert
//		service.insertStudent(tmp);

//		test select all
//		tmpList = service.selectAllStudent();
//		for(Student s: tmpList) {
//			System.out.print(s.toString());
//		}

//		test selectStudentById
//		Student student = service.selectStudentById(2);
//		System.out.println(student.toString());

//		
//		test update
//		Student student = new Student(2, "Minh Anh", "12");
//		service.updateStudent(student);

//		test delete
//		service.deleteStudentById(1);
		// -----------------------------------------------------------
//		 test insert
//		serviceSJ.insertSubject(tmpSJ);

//		test select all
//		tmpListSJ = serviceSJ.selectAllSubject();
//		for (Subject s : tmpListSJ) {
//			System.out.print(s.toString());
//		}

//		test selectStudentById
//		Subject subject = serviceSJ.selectSubjectById(2);
//		System.out.println(subject.toString());

//		test update
//		Subject subject = new Subject(2, "Lich Su" );
//		serviceSJ.updateSubject(subject);
//		test delete
		serviceSJ.deleteSubjectById(3);		
	}
}
