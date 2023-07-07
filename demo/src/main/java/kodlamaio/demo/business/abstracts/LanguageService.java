package kodlamaio.demo.business.abstracts;

import java.util.List;

import kodlamaio.demo.entities.concretes.ProgrammingLanguage;

public interface LanguageService {
	
	public void add(ProgrammingLanguage programmingLanguage) throws Exception;
	public void delete(ProgrammingLanguage programmingLanguage);
	public void update(ProgrammingLanguage programmingLanguage,int index);
	public List<ProgrammingLanguage> getAll();
	public ProgrammingLanguage getById(int id);
}
