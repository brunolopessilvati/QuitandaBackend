package br.com.yaman.quitanda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.quitanda.dao.entity.ResumoEstoque;
import br.com.yaman.quitanda.repository.ResumoEstoqueRepository;

@Service
public class EstoqueServiceImpl implements EstoqueService{
	
	@Autowired
	private ResumoEstoqueRepository estoqueRepository;
	
	@Override
	public List<ResumoEstoque> find() {
		return estoqueRepository.findResumoEstoque();
	}

}
