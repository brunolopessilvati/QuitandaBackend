package br.com.yaman.quitanda.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.yaman.quitanda.dao.entity.TipoProduto;

@Repository
@Transactional
public interface TipoProdutoRepository extends JpaCustomRepository<TipoProduto>{

}
