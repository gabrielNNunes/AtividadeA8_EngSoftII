package modelo;

public class Empregado extends ModeloEmpregado{

	public Empregado(String nome) {
		super(nome);
		
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
