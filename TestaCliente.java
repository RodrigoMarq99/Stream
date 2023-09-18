package Cliente;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestaCliente {

public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		PessoaFisica pessoa = new PessoaFisica("Jorge", "Masculino", 30, "Comum", 400.05f, "333.454.323-55", "São Paulo - SP");
		PessoaJuridica empresa = new PessoaJuridica("Loja de Carro", "", 0, "Gold", 254400.05f, "33.454.324/4243-ER", "Santos - SP");
		PessoaFisica pessoa2 = new PessoaFisica("Edson Macarano", "Masculino", 20, "Platinum", 4540.30f, "033.494.303-05", "São Bernardo do Campo - SP");
		PessoaJuridica empresa2 = new PessoaJuridica("Casa da Pamonha", "", 0, "Comum", 14403.22f, "63.404.124/4243-TC", "Aparecida do Norte - SP");
		
		pessoa.visualizar();
		empresa.visualizar();
		pessoa2.visualizar();
		empresa2.visualizar();
	
		List<String> identificarPessoa = Arrays.asList(pessoa.getNome(), pessoa2.getNome());
		 
		System.out.println("\nDigite a letra inicial de um nome e irei verificar se possui um cliente com um nome:");
		String pegarLetra = ler.nextLine(); 
		
		System.out.println("\nPessoas cujo nome iniciam com a letra " + pegarLetra +":");
		
		identificarPessoa.stream()
		        .filter(x-> x.toString().startsWith(pegarLetra.toUpperCase()))
		        .forEach(System.out::println);
		
		ler.close();
	}
}