import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	public void listarContas() {
		System.out.println(String.format("=== Lista de Contas do Banco ==="));
		System.out.println(String.format("Banco: %s" , this.nome));
		for (Conta c : this.contas) {
			System.out.println(String.format("  Agencia: %d, Numero: %d, Cliente: %s, Telefone: (%d) %s", 
					c.agencia, c.numero, c.cliente.getNome(), c.cliente.getTelefone().ddd, c.cliente.getTelefone().numero ));
		}
	}

}
