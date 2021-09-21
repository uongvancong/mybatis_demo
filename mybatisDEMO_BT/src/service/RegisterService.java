package service;

import java.util.List;

import entity.Register;

public interface RegisterService {
	public void insertRegister(Register register);

	public void updateRegister(Register register);

	public void deleteRegisterById(int registerId);

	public void deleteRegisterByIdStudent(int IdStudent);

	public void deleteRegisterByIdSubject(int IdSubject);
	
	public List<Register> selectAllRegister();

	public Register selectRegisterById(int registerId);
	
	
}
