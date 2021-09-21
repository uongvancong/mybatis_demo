package serviceImpl;
import service.*;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Subject;
 
import mapper.SubjectMapper;

public class SubjectServiceImpl implements SubjectService{

	@Override
	public void insertSubject(Subject subject) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigSubject.xml");

			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create subject mapper
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);

			subjectMapper.insert(subject);
			session.commit();
			System.out.println("insert sucessfully");

			// close session
			session.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close session
			session.close();
		}
	}

	@Override
	public void updateSubject(Subject subject) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigSubject.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create subject mapper
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);

			// update subject

			subjectMapper.update(subject);
			session.commit();
			System.out.println("update sucessfully");

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			// close session
			session.close();
		}

	}

	@Override
	public void deleteSubjectById(int subjectId) {
		// delete register byID
		RegisterServiceImpl registerService = new RegisterServiceImpl();

		registerService.deleteRegisterByIdSubject(subjectId);
		// delete subject
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigSubject.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create subject mapper
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);

			// delete subject
			subjectMapper.delete(subjectId);

			session.commit();

			System.out.println("delete successfully");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close session
			session.close();
		}
	}

	@Override
	public List<Subject> selectAllSubject() {

		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigSubject.xml");

			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

			session = sqlSessionFactory.openSession();

			// create subject mapper
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);

			// show list subject
			List<Subject> listSubjects = subjectMapper.getAll();

			return listSubjects;

		} catch (IOException e) {

			return null;

		} finally {
			// close session
			session.close();
		}

	}

	@Override
	public Subject selectSubjectById(int subjectId) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigSubject.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create subject mapper
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);

			// get subject by Id

			return subjectMapper.getById(2);

		} catch (IOException e) {
			return null;

		} finally {
			// close session
			session.close();
		}
	}

}
