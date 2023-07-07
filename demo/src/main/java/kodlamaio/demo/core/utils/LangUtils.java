package kodlamaio.demo.core.utils;

import java.util.List;

import kodlamaio.demo.entities.concretes.ProgrammingLanguage;

public class LangUtils {
	List<ProgrammingLanguage> langsList;
	
	public LangUtils(List<ProgrammingLanguage> langsList) {
		this.langsList = langsList;
	}
	
	public boolean isNameDuplicate(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage langs : langsList) {
			if(langs.getName() == programmingLanguage.getName()) {
				throw new Exception("Language Name Cannot Duplicate !");
			}
		}
		return true;
	}
}
