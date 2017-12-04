package br.com.yaman.quitanda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.EstoqueBusiness;
import br.com.yaman.quitanda.business.GenericCrudBusiness;
import br.com.yaman.quitanda.dao.entity.Estoque;
import br.com.yaman.quitanda.dao.entity.ResumoEstoque;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController  extends CrudControllerBase<Estoque>{
	
	@Autowired
	private EstoqueBusiness estoqueBusiness;
	
	@RequestMapping("/find-resumo-estoque")
	public List<ResumoEstoque> findResumoEstoque(){
		try{
			return estoqueBusiness.findResumoEstoque();
		}catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@Override
	public GenericCrudBusiness<Estoque> getBusinessClass() {
		return estoqueBusiness;
	}
	
	

}
