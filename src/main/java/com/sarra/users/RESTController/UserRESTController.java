package com.sarra.users.RESTController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sarra.users.entities.User;
import com.sarra.users.repos.UserRepository;
import java.util.List;


@RestController
public class UserRESTController {

	
	@Autowired
	UserRepository userRep;
	
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<User> getAllUsers() {
	return userRep.findAll();
	
	}
	}

