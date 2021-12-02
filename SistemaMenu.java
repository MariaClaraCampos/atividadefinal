package br.com.login.models;

import java.util.ArrayList;
import java.util.List;

public class SistemaMenu {
	
	private List<SistemaMenu> menu = new ArrayList<SistemaMenu>();

	public void adicionar(SistemaMenu m)	{
		menu.add(m);
	}
	
	public List<SistemaMenu> menu(){
		return menu;
	}

	public void adicionar(br.com.login.models.menu m) {
		
	}


}
