package com.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

//import javax.servlet.Registration;

import com.model.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDao;
import com.model.Login;

@Service
public class AppService {
	@Autowired
	private AppDao appDAO;
	List<Registration> lst=new ArrayList<Registration>();
	public boolean loginValid(Login login) {
		for(Registration r:lst)
		if(login.getUserName().equals(r.getUserName()) && login.getPassword().equals(r.getPassword())) {
			return true;
		}
		return false;
	}
	public void addUser(Registration registration) {
		//lst.add(registration);
		//System.out.println(registration.getPassword());
		appDAO.save(registration);
		System.out.println(lst);
	}
	public List<Registration> loadAll(){
		//return lst;
		List<Registration> lst=(List<Registration>) appDAO.findAll();
		return lst;
	}
	public boolean findUser(int name) {
		Optional opt=appDAO.findById(name);
			if(opt.isPresent()) {
				return true;
			}
		
		return false;
	}
	public boolean deleteUser(int id) {
		Optional opt=appDAO.findById(id);
			if(opt.isPresent()) {
				appDAO.deleteById(id);
				return true;
			}
		
		return false;
		
		
	}
	
	public boolean updateUser(Registration reg,int id) {
		Optional opt=appDAO.findById(id);
		if(opt.isPresent()) {
			appDAO.deleteById(id);
			appDAO.save(reg);
			return true;
		}
	
	return false;
	
	
	}
}
