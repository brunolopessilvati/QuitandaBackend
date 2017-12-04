package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.dao.entity.ResumoEstoque;
import br.com.yaman.quitanda.service.EstoqueService;

@Component
public class EstoqueBusiness  implements GenericCrudBusiness<Estoque> {

	@Autowired
	private EstoqueService estoqueService;
	
	
	public List<ResumoEstoque> findResumoEstoque(){
		return estoqueService.findResumoEstoque();
	}
	
	@Override
	public List<Estoque> findAll() {
		return estoqueService.findAll();
	}

	@Override
	public Estoque save(Estoque t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estoque findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Estoque t) {
		// TODO Auto-generated method stub
		
	}

}
