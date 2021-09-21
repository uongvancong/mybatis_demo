package service;

import java.util.List;

import entity.Student;

public interface StudentService {
	public void insertStudent(Student student);

	public void updateStudent(Student student);

	public void deleteStudentById(int studentId);

	public List<Student> selectAllStudent();

	public Student selectStudentById(int studentId);
}
