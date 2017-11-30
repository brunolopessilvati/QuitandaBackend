package br.com.yaman.quitanda.repository;

import java.util.List;

import br.com.yaman.quitanda.dao.entity.ResumoEstoque;

public interface ResumoEstoqueRepository {
	
	public List<ResumoEstoque> findResumoEstoque();

}
