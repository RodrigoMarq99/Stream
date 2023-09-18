package Cliente;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String sede;

	public PessoaJuridica(String nome, String sexo, int idade, String tipoDeConta, float saldo, String cnpj,
			String sede) {
		super(nome, sexo, idade, tipoDeConta, saldo);
		this.cnpj = cnpj;
		this.sede = sede;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	@Override
	public void visualizar() {
		System.out.println("----------------------\nDados do(a) Cliente");
		System.out.println("Nome Fantasia: " + getNome());
		System.out.println("Tipo da conta: " + getTipoDeConta());
		System.out.println("Saldo da empresa: R$" + getSaldo());
		System.out.println("O CNPJ desta empresa é: " + cnpj);
		System.out.println("A sede da empresa reside em: " + sede);
	}
}
