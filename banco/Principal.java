package banco;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
	Conta co1 = new Conta();
		co1.setNome("Maria Silva");
		co1.setValor(1.000);

	    Conta co2 = new Conta();
	    co2.setNome("Sabino José Ralina");
	    co2.setValor(200.000);
	    
	    Conta co3= new Conta();
	    co3.setNome("Larissa Rilary");
	    co3.setValor(1.000);
	    
	    Conta co4= new Conta();
	    co4.setNome("Raissa Bartina");
	    co4.setValor(7.000);
	    
 CadastrarConta c= new CadastrarConta();
 c.cadastrarConta(co1);
 c.cadastrarConta(co2);
 c.cadastrarConta(co3);
 c.cadastrarConta(co4);
 
 System.out.print("---Contas existentes----\n");
 System.out.println(Arrays.toString(c.listarContas()));
 //System.out.println("Buscar nome:");//
 
 String nomeBuscado = "Sabino José Ralina";
 Conta contaEncontrada = c.buscarContaPorNome(nomeBuscado);
 if (contaEncontrada != null) {
     System.out.println("\nConta encontrada:");
     System.out.println(contaEncontrada);
 } else {
     System.out.println("\nConta não encontrada.");
 }
	}

		
}