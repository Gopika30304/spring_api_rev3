package com.helmet.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.helmet.demo.model.HelmetModel;

@Repository
public interface HelmetRepository extends JpaRepository<HelmetModel,Integer> {
 
	//positional parameter
	@Query("select s from HelmetModel s where s.brand=?1 and s.type=?2")
	public List<HelmetModel> getBrand (String brand,String Type);
	

	
	//DML
	@Modifying
	@Query("delete from HelmetModel s where s.brand=?1")
	public int delectHelmetByBrand(String brand);
//	
	@Modifying
	@Query("update HelmetModel s set s.brand=?1 where s.size=?2")
	public int updateHelmetByBrand(String brand,String size);
}
