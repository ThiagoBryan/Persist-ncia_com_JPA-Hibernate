package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loga.util.JpaUtil;
import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;

public class CadastroDeProduto {
	public static void main(String[] args) {

		Categoria celulares = new Categoria();
		//"CELULARES"
		Produto celular = new Produto();
		//"Xiaomi Redmi", "Muito Legal", new BigDecimal("800"), celulares

		EntityManager em = JpaUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();// Para iniciar a transação
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();

	}
}
