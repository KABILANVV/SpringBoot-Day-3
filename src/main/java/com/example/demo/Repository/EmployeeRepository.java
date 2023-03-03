//package com.example.demo.Repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.Entity.EmployeeEntity;
//@Repository
//public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{
//	
//	@Query(value="select * from student_entity ",nativeQuery=true)
//	public List<EmployeeEntity> getAllEmployee();
//	
//	@Query(value="select * from student_entity where id=:eid",nativeQuery=true)
//	public List<EmployeeEntity> getspecifiedEmployee(@Param("eid") int id);
//	
//	
//	@Query(value="select * from student_entity where id=:eid or name=:ename",nativeQuery=true)
//	public List<EmployeeEntity> getEmployeebyIdName(@Param("eid") int sid,@Param("ename") String ename);
//
//
//}