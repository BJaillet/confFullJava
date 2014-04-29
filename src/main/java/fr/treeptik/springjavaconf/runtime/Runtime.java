package fr.treeptik.springjavaconf.runtime;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.treeptik.model.Personne;
import fr.treeptik.service.PersonneService;
import fr.treeptik.springjavaconf.config.DatasourceConfiguration;

public class Runtime {
	
	public static Logger logger = Logger.getLogger(Runtime.class);

	public static void main(String[] args) {
		
		logger.debug("coucou");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DatasourceConfiguration.class);
		
		PersonneService personneService = context.getBean(PersonneService.class);
		
		Personne personne = new Personne();
		
		logger.debug(personneService.listPersonneByIdDesc());
		
	}
	
}
