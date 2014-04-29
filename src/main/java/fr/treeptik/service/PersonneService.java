package fr.treeptik.service;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.service.spi.ServiceException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.PersonneDAO;
import fr.treeptik.model.Personne;

@Service
public class PersonneService {
	
	@Inject
	private PersonneDAO personneDAO;
	
	@Transactional
	public Personne save(Personne personne) throws ServiceException {
		
		try {
			return personneDAO.save(personne);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur save personne", e);
		}
		
	}
	
	@Transactional
	public List<Personne> findByNom(String nom) throws ServiceException {
		
		try {
			return personneDAO.findByNom(nom);
		} catch (DataAccessException e) {
			throw new ServiceException("erreur find nom", e);
		}
		
	}
	
	@Transactional
	public List<Personne> listPersonneByIdDesc() throws ServiceException {
		
		try {
			return personneDAO.listPersonneByIdDesc();
		} catch (DataAccessException e) {
			throw new ServiceException("erreur list desc", e);
		}
		
	}

}
