package dao;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		factory = Persistence.createEntityManagerFactory("hibernatetest");		
	}
	
	public static DAOOperator getDAOOperator(){
		DAOOperator dao = new DAOOperator(factory);
		return dao;
	}
	
	public static DAOCapture getDAOCapture(){
		DAOCapture dao = new DAOCapture(factory);
		return dao;
	}
	
	public static DAOProject getDAOProject(){
		DAOProject dao = new DAOProject(factory);
		return dao;
	}
}