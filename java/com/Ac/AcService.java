package com.Ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class AcService {
	@Autowired
	AcDao ad;
	public String setAc(Ac a) {
		return ad.setAc(a);
	}
	public String setAllAc(List<Ac> a) {
	
		return ad.setAllAc(a);
	}
	public List<Ac> getAllAc() {
		
		return ad.getAllAc();
	}
	
	public Ac getAcById(int a) {
		
		return ad.getAcByAllId(a);
	}
	
	public String deleteAc(int a) {
	
		return ad.deleteAc(a);
	}
	public String updateById(int id, String color) {
		
		return ad.updateById(id,color);
	}
	public String updateAll(int id, Ac b) {
		Ac x=ad.getAcByAllId(id);
		x.setBrand(b.getBrand());
		x.setPrice( b.getPrice());
		x.setCapacity(b.getCapacity());
		x.setStarRating(b.getStarRating());
		x.setModel(b.getModel());
		x.setColor(b.getColor());
		setAc(x);
		
		
		return "updated";
	}

}
