package br.com.yaman.quitanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.yaman.quitanda.business.GenericCrudBusiness;
import br.com.yaman.quitanda.business.TipoProdutoBusiness;
import br.com.yaman.quitanda.dao.entity.TipoProduto;

@RestController
@RequestMapping(value = "tipo-produto")
public class TipoProdutoController extends CrudControllerBase<TipoProduto>{

	@Autowired
	private TipoProdutoBusiness tipoProdutoBusiness;
	
	@Override
	public GenericCrudBusiness<TipoProduto> getBusinessClass() {
		return tipoProdutoBusiness;
	}

}
