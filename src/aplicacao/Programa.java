package aplicacao;

import java.util.Scanner;

import entidade.Endereco;
import servico.ServicoDeCep;

public class Programa {
@SuppressWarnings("resource")
public static void main(String[] args)  {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Informe seu CEP: ");
	String cep = sc.nextLine();
	ServicoDeCep vcs = new ServicoDeCep();
	
	try {
		
		Endereco endereco = vcs.buscaEnderecoPelo(cep);
		System.out.println("Logradouro: "+endereco.getLogradouro());
		System.out.println("Bairro: "+endereco.getBairro());
		System.out.println("Localidade: "+endereco.getLocalidade());
		System.out.println("UF: "+endereco.getUf());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
sc.close();
}

}
