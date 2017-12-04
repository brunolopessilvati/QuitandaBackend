package br.com.yaman.quitanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.TipoProduto;
import br.com.yaman.quitanda.repository.TipoProdutoRepository;
@Service
public class TipoProdutoServiceImpl implements TipoProdutoService {
	
	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;

	@Override
	public List<TipoProduto> findAll() {
		return tipoProdutoRepository.findAll();
	}

	@Override
	public TipoProduto save(TipoProduto t) {
		return tipoProdutoRepository.save(t);
	}

	@Override
	public TipoProduto findOne(Integer id) {
		return tipoProdutoRepository.findOne(id);
	}

	@Override
	public void delete(TipoProduto t) {
		tipoProdutoRepository.delete(t);
		
	}

}
