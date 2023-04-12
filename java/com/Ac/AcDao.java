package com.Ac;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class AcDao {
	@Autowired
	AcRepository ar;
	public String setAc(Ac a) {
		ar.save(a);
		return "saved";
		
	}
	public String setAllAc(List<Ac> a) {
		
		 ar.saveAll(a);
		return "saved successfully";
	}
	
	
	public List<Ac> getAllAc() {

		return ar.findAll();
	}
	

	public Ac getAcByAllId(int a) {
		
		return ar.findById(a).get();
	}
	public String deleteAc(int a) {
		
		ar.deleteById(a); 
		return "Sussessfully deleted";
		 
	}
	public String updateById(int id, String color) {
		Ac change=ar.findById(id).get();
		change.setColor(color);
		ar.save(change);
		return "Updated";
	}
	
	
	

}
