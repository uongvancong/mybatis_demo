package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Register;

public interface RegisterMapper {
	// get all register
	final String GET_ALL_REGISTER = "SELECT * FROM REGISTER";

	@Select(GET_ALL_REGISTER)
	@Results(value = { @Result(property = "id", column = "id"), @Result(property = "name", column = "name"),
			@Result(property = "idstudent", column = "idstudent"),
			@Result(property = "idsubject", column = "idsubject"),
			@Result(property = "createdDate", column = "createdDate")

	})
	public List<Register> getAll();

	// get register by id
	final String GET_REGISTER_BY_ID = "SELECT * FROM REGISTER WHERE ID = #{id}";

	@Select(GET_REGISTER_BY_ID)
	public Register getById(int id);

	// inert register
	final String INSERT_REGISTER = "INSERT INTO REGISTER (name, idstudent,  idsubject,  createdDate) "
			+ "VALUES (#{name}, #{idstudent}, #{idsubject}, #{createdDate} )";

	@Update(INSERT_REGISTER)
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void insert(Register register);

	// update register
	final String UPDATE_REGISTER = "UPDATE REGISTER SET  name = #{name}, idstudent = #{idstudent}, idsubject = #{idsubject}, createdDate = #{createdDate} WHERE ID = #{id}";

	@Insert(UPDATE_REGISTER)
	public void update(Register register);

	// delete register by id
	final String DELETE_REGISTER_BY_ID = "DELETE from REGISTER WHERE ID = #{id}";

	@Delete(DELETE_REGISTER_BY_ID)
	public void delete(int id);

	// delete register by idstudent
	final String DELETE_REGISTER_BY_ID_STUDENT = "DELETE from REGISTER WHERE idstudent = #{idstudent}";

	@Delete(DELETE_REGISTER_BY_ID_STUDENT)
	public void deleteByIdStudent(int idStudent);

	// delete register by idstudent
	final String DELETE_REGISTER_BY_ID_SUBJECT = "DELETE from REGISTER WHERE idsubject = #{idsubject}";

	@Delete(DELETE_REGISTER_BY_ID_SUBJECT)
	public void deleteByIdSubject(int idSubject);

}
