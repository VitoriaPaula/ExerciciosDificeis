package exercicioDificil;

public class Arquivos {
	char tipo;
	int codigo;
	int quantidade;
	
	public Arquivos(char tipo, int codigo, int quantidade) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public Arquivos() {
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
