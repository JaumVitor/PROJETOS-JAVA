package pilhas.Exe03;

public class DataLancamento {
	private String dia;
	private String mes; 
	private String ano;
	
	public DataLancamento(String[] dataLancamento) {
		this.dia = dataLancamento[0];
		this.mes = dataLancamento[1];
		this.ano = dataLancamento[2];
	}

	@Override
	public String toString() {
		return String.format("%s/%s/%s", this.dia, this.mes, this.ano);
	} 
	
}
