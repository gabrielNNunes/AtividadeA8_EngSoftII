package modelo;

public abstract class ModeloEmpregado {
	String nome;
	int horas;
	Double valorPorHora;
	
	public ModeloEmpregado(String nome) {
		super();
		this.nome = nome;
		this.horas = 0;
		this.valorPorHora = 0.0;
	}

	public double realizarPagamento() throws Exception{
		return 0.0;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) throws Exception {
		if (horas > 40){
			throw new Exception("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
			this.horas = horas;
	}
	

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) throws Exception {
		if(valorPorHora<30.0 || valorPorHora > 200.0){
			throw new Exception("O Valor por hora deve ser de 30 a 200");			
		}
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}
	
	
}
