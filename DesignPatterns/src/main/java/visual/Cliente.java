package visual;


import fabrica.CarregaServico;
import fabrica.EJBAbstratoFabrica;
import fabrica.ServicoAbstratoFactoy6;
import fabrica.Usaservico;

public class Cliente {

	public static void main(String[] args) {
		
		ServicoAbstratoFactoy6 fabrica = new EJBAbstratoFabrica();
		
		Usaservico usaservico =fabrica.getUsaServico();
		usaservico.salvar("Tempo real");
		usaservico.delete(10); 
		
		CarregaServico  carregaservico = fabrica.getCarreagaServico();
		carregaservico.salvar("Interface tempo real");
		carregaservico.atualizar("interface em 5 minuntos");  
		
		// TODO Auto-generated method stub

	}

}
