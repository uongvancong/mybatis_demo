package mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Student;
 
public interface StudentMapper {
	// get all student
    final String GET_ALL_STUDENT = "SELECT * FROM STUDENT";
 
    @Select(GET_ALL_STUDENT)
    @Results(value = { @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    public List<Student> getAll();
 
    // get student by id
    final String GET_STUDENT_BY_ID = "SELECT * FROM STUDENT WHERE ID = #{id}";
 
    @Select(GET_STUDENT_BY_ID)
    public Student getById(int id);
 
    // inert student
    final String INSERT_STUDENT = "INSERT INTO STUDENT (NAME, AGE  ) "
            + "VALUES (#{name}, #{age} )";
 
    @Update(INSERT_STUDENT)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insert(Student student);
 
    // update student
    final String UPDATE_STUDENT = "UPDATE STUDENT SET  NAME = #{name}, AGE = #{age} WHERE ID = #{id}";
 
    @Insert(UPDATE_STUDENT)
    public void update(Student student);
 
    // delete student by id
    final String DELETE_STUDENT_BY_ID = "DELETE from STUDENT WHERE ID = #{id}";
 
    @Delete(DELETE_STUDENT_BY_ID)
    public void delete(int id);
}
