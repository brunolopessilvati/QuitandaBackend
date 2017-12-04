package br.com.yaman.quitanda.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.quitanda.dao.entity.TipoProduto;
import br.com.yaman.quitanda.service.TipoProdutoService;

@Component
public class TipoProdutoBusiness  implements GenericCrudBusiness<TipoProduto>{

	@Autowired
	private TipoProdutoService tipoProdutoService;

	@Override
	public List<TipoProduto> findAll() {
		return tipoProdutoService.findAll();
	}

	@Override
	public TipoProduto save(TipoProduto t) {
		return tipoProdutoService.save(t);
	}

	@Override
	public TipoProduto findOne(Integer id) {
		return tipoProdutoService.findOne(id);
	}

	@Override
	public void delete(TipoProduto t) {
		tipoProdutoService.delete(t);
	}
}
