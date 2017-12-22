package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.Operator;

public class DAOOperator extends DAOGenerico<Operator> implements IOperator{

	public DAOOperator(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	public Operator pesquisarId(Integer id) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		String consulta = "SELECT o FROM Operator o WHERE o.id = :filtro";
		Query q = em.createQuery(consulta, Operator.class);
		q.setParameter("filtro", id);
		List<Operator> Operators = q.getResultList();		
		if(!Operators.isEmpty()){
			return Operators.get(0);
		}else{
			return null;
		}
	}
	

}
