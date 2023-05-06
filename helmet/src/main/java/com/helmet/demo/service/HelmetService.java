package com.helmet.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.helmet.demo.model.HelmetModel;
import com.helmet.demo.repository.HelmetRepository;

import jakarta.transaction.Transactional;

@Service

public class HelmetService {
	@Autowired
	HelmetRepository met;
	public List <HelmetModel> main(){
		return met.findAll();
	}
	public HelmetModel sub(HelmetModel h) {
		return met.save(h);
	}
	public HelmetModel dub(HelmetModel h) {
		return met.save(h);
	}
	public void del(int cost)
	{
		met.deleteById(cost);
	}
	public List<HelmetModel>sortHelmetModel(String field){
			 
		return met.findAll(Sort.by(Direction.DESC,field));
	}
	//paging
	public  List<HelmetModel>pagingHelmet(int offset,int pageSize){
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<HelmetModel> obj=met.findAll(paging);
		List<HelmetModel>sc=obj.getContent();
		return sc;
	}
	//pagination without getcontent()
	public  Page<HelmetModel> pageableHelmet(int offset,int pageSize){
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<HelmetModel> obj=met.findAll(paging);
		return obj;
	}
	//pagination with sorting
	public  List<HelmetModel>pagingHelmet(int offset,int pageSize,String field){
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<HelmetModel> obj=met.findAll(paging);
		List<HelmetModel>sc=obj.getContent();
		return sc;
	}
	public List<HelmetModel> getBrand (String brand,String Type)
	{
		List<HelmetModel> li=met.getBrand(brand, Type);
		return li;
	}
	@Transactional
	public int delectHelmetByBrand(String brand) {
		
		return met.delectHelmetByBrand(brand);
	}
	@Transactional
	public int updateHelmetByBrand(String brand,String size) {
		return met.updateHelmetByBrand(brand, size);
	}
	
	
	
	
	
	


}
