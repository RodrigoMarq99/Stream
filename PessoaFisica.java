package Cliente;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String local;

	public PessoaFisica(String nome, String sexo, int idade, String tipoDeConta, float saldo, String cpf,
			String local) {
		super(nome, sexo, idade, tipoDeConta, saldo);
		this.cpf = cpf;
		this.local = local;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Esta pessoa física tem o CPF número: " + cpf);
		System.out.println("Esta pessoa física tem sua agência matriz em: " + local);
	}
}
