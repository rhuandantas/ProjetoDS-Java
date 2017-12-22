package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.FileType;
import model.Operator;
import model.Project;

public class DAOProject extends DAOGenerico<Project> implements IProject{

	public DAOProject(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	public List<Project> searchByOperator(Operator operator) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		String consulta = "SELECT p FROM Project p WHERE p.operator.getName() = :filtro";
		Query q = em.createQuery(consulta, Project.class);
		q.setParameter("filtro", operator.getName());
		List<Project> Projects = q.getResultList();		
		if(!Projects.isEmpty()){
			return (List<Project>) Projects.get(0);
		}else{
			return null;
		}
	}

	public List<Project> searchByFileType(FileType fileType) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		String consulta = "SELECT p FROM Project p WHERE p.fileType = :filtro";
		Query q = em.createQuery(consulta, Project.class);
		q.setParameter("filtro", fileType);
		List<Project> Projects = q.getResultList();		
		if(!Projects.isEmpty()){
			return (List<Project>) Projects.get(0);
		}else{
			return null;
		}
	}

	public List<Project> searchByName(String name) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		String consulta = "SELECT p FROM Project p WHERE p.name = :filtro";
		Query q = em.createQuery(consulta, Project.class);
		q.setParameter("filtro", name);
		List<Project> Projects = q.getResultList();		
		if(!Projects.isEmpty()){
			return (List<Project>) Projects.get(0);
		}else{
			return null;
		}

	}

}
