package dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.Capture;
import model.FileType;
import model.Operator;
import model.PlatformCapture;

public class DAOCapture extends DAOGenerico<Capture> implements ICapture{

	public DAOCapture(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	public List<Capture> seachByData(Calendar data) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Capture> searchByFileType(FileType fileType) {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		String consulta = "SELECT c FROM Capture c WHERE c.fileType = :filtro";
		Query q = em.createQuery(consulta, Capture.class);
		q.setParameter("filtro", fileType);
		List<Capture> Captures = q.getResultList();		
		if(!Captures.isEmpty()){
			return (List<Capture>) Captures.get(0);
		}else{
			return null;
		}
	}

	public List<Capture> searchByPlatformCapture(PlatformCapture platform) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Capture> searchByOperator(Operator operator) {
		// TODO Auto-generated method stub
		return null;
	}

}
