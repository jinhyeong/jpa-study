package jpabook.jpashop.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		//		Member member = em.find(Member.class, 1L);

		try {
//			List<Member> result = em.createQuery("select m from Member as m", Member.class)
//					.setFirstResult(5)
//					.setMaxResults(8)
//					.getResultList();
			Member member = new Member();
			member.setId(100L);
			member.setName("HelloAA");
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			em.close();

		}

		transaction.commit();

		emf.close();
	}
}
