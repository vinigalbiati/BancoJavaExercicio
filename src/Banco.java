import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		contas = new ArrayList<>();
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public List<String> listarContas(){
		List<String> contasFormatadas = new ArrayList<>();
		for(Conta conta: contas){
			String info = "\n\nagencia: " + conta.getAgencia() +
							"\nconta: " + conta.getNumero() +
							"\ncliente: "+ conta.getCliente().getNome();
			contasFormatadas.add(info);
		}
		return contasFormatadas;

	}

	

	

	

	

}
