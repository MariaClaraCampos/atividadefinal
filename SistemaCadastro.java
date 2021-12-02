package br.com.login.models;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
	
	private List<SistemaCadastro> cadastro = new ArrayList<SistemaCadastro>();

	public void adicionar(SistemaCadastro c)	{
		cadastro.add(c);
	}
	
	public List<SistemaCadastro> Cadastro(){
		return cadastro;
	}

	public Object consultar() {
		return null;
	}

	public void adicionar(br.com.login.models.cadastro c) {
		
	}
	
}

