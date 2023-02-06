package aplicacao;

import java.util.Scanner;

import entidade.Endereco;
import servico.ServicoDeCep;

public class Programa {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	System.out.println("Informe seu CEP: ");
	String cep = new Scanner(System.in).nextLine();
	Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);
	
	System.out.println("Logradouro: "+endereco.getLogradouro());
	System.out.println("Bairro: "+endereco.getBairro());
	System.out.println("Localidade: "+endereco.getLocalidade());
	System.out.println("UF: "+endereco.getUf());
	
}
}
