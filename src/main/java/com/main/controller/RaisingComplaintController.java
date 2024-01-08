package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.main.entity.RaisingComplaint;
import com.main.service.RaisingComplaintService;

@RestController
@RequestMapping("/rc")
@CrossOrigin("*")
public class RaisingComplaintController {
 @Autowired
 private RaisingComplaintService rcs;
 
 @PostMapping("/add")
 public RaisingComplaint postRaisingComplaint(@RequestBody RaisingComplaint rc) {
	 return rcs.addRaisingComplaint(rc);
 }
 
 @GetMapping("/all")
 public List<RaisingComplaint> getAllRaisingComplaint() {
	 return rcs.getRaisingComplaint();
 }
 
 @GetMapping("/get/{id}")
 public Optional<RaisingComplaint> getRaisingComplaint(@PathVariable int id) {
	 return rcs.getdatabyid(id);
 }
 
 @DeleteMapping("/{id}")
 public void DelRaisingComplaint(@PathVariable int id) {
	 rcs.delRaisingComplaint(id);
 }
 
 @PutMapping("/put/{id}")
 public RaisingComplaint putRaisingComplaint(@PathVariable int id,@RequestBody RaisingComplaint rc) {
	return rcs.updatedata(id, rc);
 }
}
