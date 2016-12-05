package eGovFramework.student.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import eGovFramework.student.StudentVO;
import eGovFramework.student.service.StudentDAO;
import eGovFramework.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Inject
	private StudentDAO studentDAO;

	public void insertStudent(StudentVO vo) throws Exception {
		studentDAO.insertStudent(vo);
		// TO DO List (DAO와는 다르다)
	}

	public List<StudentVO> selectStudent() throws Exception {
		return studentDAO.selectStudent();
	}

}
