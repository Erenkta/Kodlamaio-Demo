package kodlamaio.demo.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.demo.business.abstracts.LanguageService;
import kodlamaio.demo.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
	LanguageService languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		languageService.add(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {
		languageService.delete(programmingLanguage);
	}
	
	@GetMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage,int index) {
		languageService.update(programmingLanguage, index);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getall(){
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return languageService.getById(id);
	}
}
