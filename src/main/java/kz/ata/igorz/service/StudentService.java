package kz.ata.igorz.service;

/**
 * Created by Jtahun on 13.02.2019.
 */
import kz.ata.igorz.model.Student;

public interface StudentService {
    void insertStudent(Student student);
    boolean getStudentByLogin(String userName, String password);
    boolean getStudentByUserName(String userName);
}
