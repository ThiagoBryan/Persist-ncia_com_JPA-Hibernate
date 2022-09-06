package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.modelo.Produto;

public class CadastroDeProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		celular.setNome("Xiaomi Redmi");
		celular.setDescricao("Muito Legal");
		celular.setPreco(new BigDecimal("800"));
		
		//EntityManagerFactory para criar EntityManager precisa criar essa antes
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		
		// EntityManager acessa o banco de dados com a jpa
		EntityManager em =  factory.createEntityManager();
		em.getTransaction().begin();// Para iniciar a transação
		em.persist(celular);// para inserir um objeto(celular) no Banco de dados
		em.getTransaction().commit();
		em.close();
		
	}
}
