package modelo;

public class EmpregadoTerceirizado extends ModeloEmpregado{
	
	

	public EmpregadoTerceirizado(String nome) {
		super(nome);
		this.adicional = 0.0;
	}


	Double adicional;
	

	public double realizarPagamento() throws Exception{
		if(this.valorPorHora == 0.0) {
			throw new Exception("O valor por hora deve ser maior que 0");
		}if(this.horas==0){
			throw new Exception("A quantidade de horas deve ser maior que 0");
		}if(this.adicional==0.0){
			throw new Exception("O adicional deve ser maior que 0");
		}
		Double somaPagamento = this.valorPorHora * this.horas + this.adicional;
		Double salarioMinimo = 1100.00;
		if(somaPagamento < salarioMinimo){
			somaPagamento = salarioMinimo;
		}
		return somaPagamento;
	}


	public Double getAdicional() {
		return adicional;
	}


	public void setAdicional(Double adicional) throws Exception {
		if(adicional<100.0 || adicional > 1100.0){
			throw new Exception("O adicional deve ser de 100 a 1100");			
		}
		this.adicional = adicional;
	}
	
	
}
