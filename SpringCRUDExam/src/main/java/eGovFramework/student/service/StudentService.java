package eGovFramework.student.service;

import java.util.List;
import eGovFramework.student.StudentVO;


public interface StudentService {
	
    void insertStudent(StudentVO vo) throws Exception;
    
    List<StudentVO> selectStudent() throws Exception;
    
}