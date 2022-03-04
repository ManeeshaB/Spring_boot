package com.example.demo.controller;

//import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;*/

//import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	SaveServices service;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) 
	{
		service.newadd(alien);
		return"home.jsp";
	}
	//@RequestMapping("/getAlien")
	//public ModelAndView getAlien(@RequestParam Integer aid) 
	/*{
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}*/
}
