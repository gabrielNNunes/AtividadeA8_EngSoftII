package modelo;

public class Empregado extends ModeloEmpregado{
  String nome;
	int horas;
	Double valorPorHora;

	public Empregado(String nome) {
		super();
		this.nome = nome;
		this.horas = 0;
		this.valorPorHora = 0.0;
		
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
  
	public double realizarPagamento() throws Exception{
		if(this.valorPorHora == 0) {
			throw new Exception("O valor por hora deve ser maior que 0");
		}if(this.horas==0){
			throw new Exception("A quantidade de horas deve ser maior que 0");
		}
		Double somaPagamento = this.valorPorHora * this.horas;
		Double salarioMinimo = 1100.00;
		if(somaPagamento < salarioMinimo){
			somaPagamento = salarioMinimo;
		}
		return somaPagamento;
	}

}
