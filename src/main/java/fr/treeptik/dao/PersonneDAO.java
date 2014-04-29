package fr.treeptik.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Personne;

public interface PersonneDAO extends JpaRepository<Personne, Integer> {
	
	List<Personne> findByNom(@Param("nom") String nom) throws DataAccessException;
	
	@Query ("select p from Personne p order by p.id desc")
	List<Personne> listPersonneByIdDesc() throws DataAccessException;
}
