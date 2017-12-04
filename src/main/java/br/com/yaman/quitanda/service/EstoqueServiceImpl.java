package br.com.yaman.quitanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.dao.entity.ResumoEstoque;
import br.com.yaman.quitanda.repository.EstoqueRepository;
import br.com.yaman.quitanda.repository.ResumoEstoqueRepository;

@Service
public class EstoqueServiceImpl implements EstoqueService{
	
	@Autowired
	private ResumoEstoqueRepository resumoEstoqueRepository;
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Override
	public List<ResumoEstoque> findResumoEstoque() {
		return resumoEstoqueRepository.findResumoEstoque();
	}

	@Override
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

	@Override
	public Estoque save(Estoque t) {
		return estoqueRepository.save(t);
	}

	@Override
	public Estoque findOne(Integer id) {
		return estoqueRepository.findOne(id);
	}

	@Override
	public void delete(Estoque t) {	
		estoqueRepository.delete(t);
	}

}
