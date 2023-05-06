package com.helmet.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.helmet.demo.model.HelmetModel;
import com.helmet.demo.service.HelmetService;

@RestController
public class HelmetController {
	@Autowired
	HelmetService hel;
	@GetMapping("/login")
		public List <HelmetModel> main(){
		return hel.main();
	}
	@PostMapping("/signin")
		public HelmetModel sub(@RequestBody HelmetModel h) {
		return hel.sub(h);
		
	}
	
	@PutMapping("/signup")
	public HelmetModel dub(@RequestBody HelmetModel h) {
	return hel.sub(h);
	
    }
	
	@DeleteMapping("/del/{cost}")
	public void delect(@PathVariable("cost") int cost) {
		hel.del(cost);
	}
	@GetMapping("sort/{field}")
	public List<HelmetModel> sortHelmetModel(@PathVariable String field){
		return hel.sortHelmetModel(field);
	}
	@GetMapping("/helm/{offset}/{pageSize}")
	public List<HelmetModel> HelmetModel (@PathVariable int offset,@PathVariable int pageSize){
		return hel.pagingHelmet(offset,pageSize);
	}
	@GetMapping("/helm1/{offset}/{pageSize}")
	public Page<com.helmet.demo.model.HelmetModel> PageHelmetModel (@PathVariable int offset,@PathVariable int pageSize){
		return hel.pageableHelmet(offset,pageSize);
	}
	@GetMapping("/helm2/{offset}/{pageSize}/{field}")
	public List<HelmetModel> HelmetModel (@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		return hel.pagingHelmet(offset,pageSize,field);
	}
	@GetMapping("/getBrand/{Brand}/{type}")
	public List<HelmetModel> getBrand (String brand,String Type)
	{
		List<HelmetModel>li=hel.getBrand(brand, Type);
		return li;
	}
	@DeleteMapping("/deleteByBrand/{brand}")
	public String delectHelmetByBrand(String Brand) {
		int res=hel.delectHelmetByBrand(Brand);
		if(res>0)
			return "Helmet record deleted";
		else
			return "error occuerd";
	}
	@PutMapping("/updateByBrandSize/{brand}/{size}")
	public String  updateHelmetByBrand(String brand,String size) {
		int res=hel.updateHelmetByBrand(brand, size);
		if(res>0)
			return "Helmet record updated";
		else
			return "problem occured";
	}
	
	
	
	

}
