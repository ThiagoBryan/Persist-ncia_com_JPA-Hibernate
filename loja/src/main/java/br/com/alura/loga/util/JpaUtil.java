package br.com.alura.loga.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	//EntityManagerFactory para criar EntityManager precisa criar essa antes
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
	// EntityManager acessa o banco de dados com a jpa
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}
