import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Banco bb = new Banco();
		bb.setNome("Banco Bizarro");
		bb.setContas(new ArrayList<Conta>());
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Telefone telefone = new Telefone();
		telefone.ddd = 11;
		telefone.numero = "91234-5678";
		venilton.setTelefone(telefone);
		
		
		Conta cc = new ContaCorrente(venilton);
		bb.getContas().add(cc);
		
		Conta poupanca = new ContaPoupanca(venilton);
		bb.getContas().add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		bb.listarContas();
	}

}
