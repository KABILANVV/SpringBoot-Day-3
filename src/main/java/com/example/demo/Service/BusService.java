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
//import com.example.demo.Repository.BusRepository;
//import com.example.demo.Entity.BusEntity;
//
//@Service
//public class BusService {
//
//	@Autowired
//	BusRepository Erepo;
//	public String addDetails(BusEntity ee) {
//		Erepo.save(ee);
//		return "Data added";
//	}
//	
//	public String updateDetails(BusEntity ee) {
//		Erepo.saveAndFlush(ee);
//		return "Data updated";
//	}
//	
//	public String deleteDetails(int id) {
//		Erepo.deleteById(id);
//		return "data Deleted";
//	}
//	public List<BusEntity> sortByField(String field){
//		return Erepo.findAll(Sort.by(Sort.Direction.ASC,field));
//	}
//	
//	public Optional<BusEntity> getById(int id) {
//		return Erepo.findById(id);
//	}
//	public List<BusEntity> showDetails(){
//		return Erepo.findAll();
//	}
//	
//	public List<BusEntity> getWithPagination(int offset,int pageSize){
//		Page<BusEntity> page = Erepo.findAll(PageRequest.of(offset,pageSize));
//		return page.getContent();
//	}
//}