package banco;

public class Conta {
	private String nome;
	private Double valor;
	
	
	@Override
	public String toString() {
		return "nome:" + nome + "\n valor:" + valor + "\n";
	}

	public Conta() {

	}

	public Conta(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
