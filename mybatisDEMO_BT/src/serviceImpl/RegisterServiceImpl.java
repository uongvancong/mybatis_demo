package serviceImpl;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Register;
import mapper.RegisterMapper;
import service.*;

public class RegisterServiceImpl implements RegisterService {
	public RegisterServiceImpl() {
	}

	@Override
	public void insertRegister(Register register) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");

			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			registerMapper.insert(register);
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
	public void updateRegister(Register register) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			// update register

			registerMapper.update(register);
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
	public void deleteRegisterById(int registerId) {
		// delete register byID

		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			// delete register
			registerMapper.delete(3);
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
	public List<Register> selectAllRegister() {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			// show list register
			List<Register> listRegisters = registerMapper.getAll();

			return listRegisters;
		} catch (IOException e) {
			return null;
		} finally {
			// close session
			session.close();
		}

	}

	@Override
	public Register selectRegisterById(int registerId) {
		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			// get register by Id

			return registerMapper.getById(2);

		} catch (IOException e) {
			return null;

		} finally {
			// close session
			session.close();
		}
	}

	@Override
	public void deleteRegisterByIdStudent(int IdStudent) {
		// delete register byIDStudent

		Reader reader;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// create register mapper
			RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

			// delete register
			registerMapper.deleteByIdStudent(IdStudent);
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
	public void deleteRegisterByIdSubject(int IdSubject) {
		// delete register byIDStudent

				Reader reader;
				SqlSession session = null;
				try {
					reader = Resources.getResourceAsReader("SqlMapConfigRegister.xml");
					SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
					session = sqlSessionFactory.openSession();

					// create register mapper
					RegisterMapper registerMapper = session.getMapper(RegisterMapper.class);

					// delete register
					registerMapper.deleteByIdSubject(IdSubject);
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

}
