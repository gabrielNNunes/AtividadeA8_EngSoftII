package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpregadoTerceirizadoTest {

	
	EmpregadoTerceirizado empregadoTerceirizado;
	
	
	@BeforeEach
	private void instanciarObjetos() {		
		empregadoTerceirizado = new EmpregadoTerceirizado("Gabriel Nunes");
	}
 //=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoMaiorQue1100() throws Exception {
		EmpregadoTerceirizado empreTer = new EmpregadoTerceirizado("Teste");
		empreTer.setValorPorHora(150.0);
		empreTer.setHoras(10);
		empreTer.setAdicional(200.0);
		Assertions.assertEquals(1700.00,empreTer.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento	
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoMenorQue1100() throws Exception{
		empregadoTerceirizado.setValorPorHora(30.0);
		empregadoTerceirizado.setHoras(30);
		empregadoTerceirizado.setAdicional(100.00);
		Assertions.assertEquals(1100.00,empregadoTerceirizado.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoIgualA1100() throws Exception{
		empregadoTerceirizado.setValorPorHora(100.0);
		empregadoTerceirizado.setHoras(10);
		empregadoTerceirizado.setAdicional(100.00);
		Assertions.assertEquals(1100.00,empregadoTerceirizado.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento

	@Test
	public void realizarPagamentoEmpregadoTerceirizadoValorPorHoraIgualA0(){
		String mensagemErro = "";
		try {
		EmpregadoTerceirizado empreTer = new EmpregadoTerceirizado("Teste");
		empreTer.setHoras(30);
    empreTer.setAdicional(100.00);  
		empreTer.realizarPagamento();
		}catch (Exception e) {
			mensagemErro = e.getMessage();
			
		}
		Assertions.assertEquals("O valor por hora deve ser maior que 0",mensagemErro);
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoHoraIgualA0(){
		String mensagemErro = "";
		try {
		EmpregadoTerceirizado empreTer = new EmpregadoTerceirizado("Teste");
		empreTer.setValorPorHora(30.0);
    empreTer.setAdicional(100.00);  
		empreTer.realizarPagamento();
		}catch (Exception e) {
			mensagemErro = e.getMessage();
		}
		Assertions.assertEquals("A quantidade de horas deve ser maior que 0",mensagemErro);
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoAdicionalIgualA0(){
		String mensagemErro = "";
		try {
		EmpregadoTerceirizado empreTer = new EmpregadoTerceirizado("Teste");
		empreTer.setValorPorHora(30.0);
		empreTer.setHoras(30);
		empreTer.realizarPagamento();
		}catch (Exception e) {
			mensagemErro = e.getMessage();
		}
		Assertions.assertEquals("O adicional deve ser maior que 0",mensagemErro);
		}
//=======================================================================================================SetHoras		
	@Test
	public void TesteSetHorasEmpregadoTerceirizado() throws Exception {
		empregadoTerceirizado.setHoras(30);
		Assertions.assertEquals(30,empregadoTerceirizado.getHoras());
	}
//=======================================================================================================SetHoras	
	@Test
	public void TesteSetHorasEmpregadoTerceirizadoMaiorQue40() {
		String mensagemErro = "";
		try {
		empregadoTerceirizado.setHoras(45);
		}catch (Exception e) {
			mensagemErro =  e.getMessage();
		}
		Assertions.assertEquals("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.",mensagemErro);
	}
//=======================================================================================================SetValorPorHora
	@Test
	public void TesteSetValorPorHoraEmpregadoTerceirizado() throws Exception {
		empregadoTerceirizado.setValorPorHora(45.0);
		Assertions.assertEquals(45.0,empregadoTerceirizado.getValorPorHora());
	}
//=======================================================================================================SetValorPorHora
	@Test
	public void TesteSetValorPorHoraEmpregadoTerceirizadoMaisQue200() {
		String mensagemErro = "";
		try {
			empregadoTerceirizado.setValorPorHora(250.0);
		}catch (Exception e) {
			mensagemErro =  e.getMessage();
		}		
		Assertions.assertEquals("O Valor por hora deve ser de 30 a 200",mensagemErro);
	}
//=======================================================================================================SetValorPorHora
	@Test
	public void TesteSetValorPorHoraEmpregadoTerceirizadoMenorQue30() {
		String mensagemErro = "";
		try {
			empregadoTerceirizado.setValorPorHora(25.0);
		}catch (Exception e) {
			mensagemErro =  e.getMessage();
		}
		
		Assertions.assertEquals("O Valor por hora deve ser de 30 a 200",mensagemErro);
	}
//=======================================================================================================SetAdicional
	@Test
	public void TesteSetAdicionalEmpregadoTerceirizado() throws Exception {		
			empregadoTerceirizado.setAdicional(150.0);			
		Assertions.assertEquals(150.0,empregadoTerceirizado.getAdicional());
	}
//=======================================================================================================SetAdicional
		@Test
		public void TesteSetAdicionalEmpregadoTerceirizadoMaiorQue1100() {
			String mensagemErro = "";
			try {
				empregadoTerceirizado.setAdicional(150.0);
			}catch (Exception e) {
				mensagemErro =  e.getMessage();
			}
			
			Assertions.assertEquals("O adicional deve ser de 100 a 1100",mensagemErro);
		}
//=======================================================================================================SetAdicional	
		@Test
		public void TesteSetAdicionalEmpregadoTerceirizadoMenorQue100() {
			String mensagemErro = "";
			try {
				empregadoTerceirizado.setAdicional(150.0);
			}catch (Exception e) {
				mensagemErro =  e.getMessage();
			}
			
			Assertions.assertEquals("O adicional deve ser de 100 a 1100",mensagemErro);
		}	
//=======================================================================================================	
}
