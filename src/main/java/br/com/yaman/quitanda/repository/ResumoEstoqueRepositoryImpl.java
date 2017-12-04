package br.com.yaman.quitanda.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.yaman.quitanda.dao.entity.ResumoEstoque;
@Repository
@Transactional
public class ResumoEstoqueRepositoryImpl implements ResumoEstoqueRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ResumoEstoque> findResumoEstoque() {
		Query query = entityManager.createQuery("SELECT SUM(e.quantidadeDisponivel) AS total, tp.nome AS nome "
				+ "FROM Estoque e, Produto p, TipoProduto tp "
				+ "WHERE p.id = e.produto.id AND e.produto.tipoProduto.id = tp.id "+
							"group by(tp.nome)");
		return query.getResultList();
	}
	
	

}
