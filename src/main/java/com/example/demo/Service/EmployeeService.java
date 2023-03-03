//package com.example.demo.Service;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Repository.EmployeeRepository;
//import com.example.demo.Entity.EmployeeEntity;
//
//@Service
//public class EmployeeService {
//
//	@Autowired
//	EmployeeRepository Emprepo;
//	public String addDetails(EmployeeEntity ee) {
//		Emprepo.save(ee);
//		return "Data added";
//	}
//	
//	public String updateDetails(EmployeeEntity ee) {
//		Emprepo.saveAndFlush(ee);
//		return "Data updated";
//	}
//	
//	public String deleteDetails(int id) {
//		Emprepo.deleteById(id);
//		return "data Deleted";
//	}
//	public List<EmployeeEntity> sortByField(String field){
//		return Emprepo.findAll(Sort.by(Sort.Direction.ASC,field));
//	}
//	
//	public Optional<EmployeeEntity> getById(int id) {
//		return Emprepo.findById(id);
//	}
//	public List<EmployeeEntity> showDetails(){
//		return Emprepo.findAll();
//	}
//	
//	public List<EmployeeEntity> getWithPagination(int offset,int pageSize){
//		Page<EmployeeEntity> page = Emprepo.findAll(PageRequest.of(offset,pageSize));
//		return page.getContent();
//	}
//	
//	public List<EmployeeEntity> getUserInfo()
//	{
//		return Emprepo.getAllEmployee();
//	}
//	
//	public List<EmployeeEntity> getparticularEmployee(int eid)
//	{
//		return Emprepo.getspecifiedEmployee(eid);
//	}
//	
//	public List<EmployeeEntity> getEmployeeByIdName(int eid,String ename)
//	{
//		return Emprepo.getEmployeebyIdName(eid, ename);
//	}
//
//}