package kodlamaio.demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.demo.dataAccess.abstracts.LanguageRepository;
import kodlamaio.demo.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<ProgrammingLanguage> langsList;
	
	public InMemoryLanguageRepository() {
		langsList = new ArrayList<ProgrammingLanguage>();
		langsList.add(new ProgrammingLanguage(1,"Python"));
		langsList.add(new ProgrammingLanguage(2,"Java"));
		langsList.add(new ProgrammingLanguage(3,"C#"));
	}
	
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		langsList.add(programmingLanguage);
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		langsList.remove(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage,int index) {
		langsList.set(index, programmingLanguage);
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return langsList;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		ProgrammingLanguage lang = new ProgrammingLanguage();
		for(ProgrammingLanguage langs : langsList) {
			if(langs.getLangId() == id) {
				lang = langs;
			}
		}
		return lang;
	}

}
