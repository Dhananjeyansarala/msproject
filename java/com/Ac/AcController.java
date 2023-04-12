 
package com.Ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcController {
	@Autowired
	AcService as;
	@PostMapping("/setAc")
	public String setAc(@RequestBody Ac a) {
		return as.setAc(a);
	}
	@PostMapping("/setAllAc")
	public String setAllAc(@RequestBody  List<Ac> a) {
		return as.setAllAc(a);
	}
	
	@GetMapping("/getAllAc")
	public List<Ac> getAllAc() {
		return as.getAllAc();
	}
	
	@GetMapping("/getAcById/{a}")
	public Ac getAcById(@PathVariable int a) {
		return as.getAcById(a);
	}
	@DeleteMapping("/deleteMapping/{a}")
	public String deleteAc(@PathVariable int a ) {
		return as.deleteAc(a);
	}
	@PutMapping("/update/{id}/{color}")
	public String updateById(@PathVariable int id,@PathVariable String color ) {
		return as.updateById(id,color);
	}
	@PutMapping("/updateAll/{id}")
	public String updateAll(@PathVariable int id,@RequestBody Ac b) {
		return as.updateAll(id,b);
	}


}
