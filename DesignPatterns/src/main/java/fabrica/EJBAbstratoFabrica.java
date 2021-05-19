package fabrica;

import Servico.CarregaEJBServico;
import Servico.UsaEJBServico;

public class EJBAbstratoFabrica implements ServicoAbstratoFactoy6 {

	@Override
	public Usaservico getUsaServico() {
		// TODO Auto-generated method stub
		return new UsaEJBServico () ;
	}

	@Override
	public CarregaServico getCarreagaServico() {
		// TODO Auto-generated method stub
		return new CarregaEJBServico();
	}

}
