package service;

import java.util.List;

import entity.Subject;

public interface SubjectService {
	public void insertSubject(Subject subject);

	public void updateSubject(Subject subject);

	public void deleteSubjectById(int subjectId);

	public List<Subject> selectAllSubject();

	public Subject selectSubjectById(int subjectId);
}
