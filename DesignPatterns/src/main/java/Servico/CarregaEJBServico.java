package Servico;

import fabrica.CarregaServico;

public class CarregaEJBServico implements CarregaServico {

	@Override
	public void salvar(String modelo) {
		// TODO Auto-generated method stub
		System.out.println("o novo carregamento EJB e : " + modelo );
	}

	@Override
	public void atualizar(String novomodelo) {
		// TODO Auto-generated method stub
		System.out.println("o carregamento atualizado EJB e : " + novomodelo );

	}

}
