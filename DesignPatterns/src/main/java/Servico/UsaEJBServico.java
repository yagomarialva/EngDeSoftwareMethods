package Servico;

import fabrica.Usaservico;

public class UsaEJBServico implements Usaservico {

	@Override
	public void salvar(String nome) {
		// TODO Auto-generated method stub
		System.out.println("O novo servico EJB e: " + nome );

	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		System.out.println("O cliente inativo é : " + id );
		return true;
	}

}
