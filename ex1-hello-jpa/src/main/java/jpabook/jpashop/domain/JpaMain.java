package jpabook.jpashop.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			// logic
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			entityManager.close();
		}
		
		entityManagerFactory.close();

	}
}
