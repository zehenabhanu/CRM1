package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entity.RaisingComplaint;
import com.main.repo.RaisingComplaintrepo;

@Service
public class RaisingComplaintService {
	@Autowired
 private RaisingComplaintrepo rcr;
	
	public RaisingComplaint addRaisingComplaint(RaisingComplaint rc) {
		return rcr.save(rc);
	}
	
	public List<RaisingComplaint> getRaisingComplaint() {
		return rcr.findAll();
	}
	
	public void delRaisingComplaint(int id) {
		rcr.deleteById(id);
	}
	
	public Optional<RaisingComplaint> getdatabyid(int id) {
		return rcr.findById(id);
	}
	
	public RaisingComplaint updatedata(int id,RaisingComplaint rc) {
		  Optional<RaisingComplaint> raisingComplaint= rcr.findById(id);
		  if(raisingComplaint.isPresent()) {
			  RaisingComplaint existingraisingComplaint=raisingComplaint.get();
			  existingraisingComplaint.setPname(rc.getPname());
			  existingraisingComplaint.setSubject(rc.getSubject());
			  existingraisingComplaint.setComplaint(rc.getComplaint());
		return rcr.save(existingraisingComplaint);
		  }
		  else {
			  return null;
		  }
	  }
	
 
}
