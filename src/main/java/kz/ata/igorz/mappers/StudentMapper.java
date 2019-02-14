package kz.ata.igorz.mappers;

/**
 * Created by Jtahun on 13.02.2019.
 */
import kz.ata.igorz.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
    @Insert("INSERT INTO student(userName, password, firstName,"
            + "lastName, dateOfBirth, emailAddress) VALUES"
            + "(#{userName},#{password}, #{firstName}, #{lastName},"
            + "#{dateOfBirth}, #{emailAddress})")
    @Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
    public void insertStudent(Student student);

    @Select("SELECT USERNAME as userName, PASSWORD as password, "
            + "FIRSTNAME as firstName, LASTNAME as lastName, "
            + "DATEOFBIRTH as dateOfBirth, EMAILADDRESS as emailAddress "
            + "FROM student WHERE userName = #{userName}")
    public Student getStudentByUserName(String userName);


}
