package br.com.yaman.quitanda.service;

import java.util.List;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.dao.entity.ResumoEstoque;

public interface EstoqueService extends GenericCrudService<Estoque> {
	
	public List<ResumoEstoque> findResumoEstoque();

}
