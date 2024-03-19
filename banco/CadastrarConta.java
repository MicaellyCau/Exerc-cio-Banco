package banco;

import java.util.Arrays;
public class CadastrarConta {

	Conta[] c = new Conta[10];
	int cont = 0; 
	public void cadastrarConta(Conta conta) {
		if(c.length<=10) {
			c[cont]= conta;
			cont++;
		}
	else {
		System.out.println("Não podem ser cadastradas mais contas!");
	}	
}

public Conta[] listarContas() {
	return c;
} 

public Conta buscarContaPorNome(String nome) {
    for (Conta conta : c) {
        if (conta != null && conta.getNome().equalsIgnoreCase(nome)) {
            return conta;
        }
    }
    return null; 
}

}
