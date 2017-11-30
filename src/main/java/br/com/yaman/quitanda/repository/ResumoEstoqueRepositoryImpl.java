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
		Query query = entityManager.createQuery("select sum(QTD_DISPONIVEL) as total, estoque.produto.tipoProduto.id as id from Estoque estoque "+
							" join Produto as produto on estoque.produto.tipoProduto.id = produto.id "+
							" join TipoProduto as tipoProduto on tipoProduto.id = produto.tipoProduto.id "+
							"group by(estoque.produto.tipoProduto.id)");
		List<ResumoEstoque> retorno = query.getResultList();
		return retorno;
	}

}
