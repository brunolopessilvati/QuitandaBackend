package br.com.yaman.quitanda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.dao.entity.ResumoEstoque;
import br.com.yaman.quitanda.service.EstoqueService;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController {
	
	@Autowired
	private EstoqueService estoqueService;
	
	@RequestMapping("/find")
	public List<ResumoEstoque> find(){
		try{
			return estoqueService.find();
		}catch (Exception e) {
			return new ArrayList<>();
		}
	}
	
	

}
