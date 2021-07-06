package modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class EmpregadoTest {
    ModeloEmpregado empregado;	
	
    @BeforeEach
    private void instanciarObjetos() {
      empregado = new Empregados("Gabriel Nunes");
    }
  
//=======================================================================================================RealizarPagamento	
  	@Test
	public void realizarPagamentoEmpregadoMaiorQue1100() throws Exception {
		ModeloEmpregado empre = new Empregados("Teste");
		empre.setValorPorHora(150.0);
		empre.setHoras(10);
		Assertions.assertEquals(1500.00,empre.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento	
	@Test
	public void realizarPagamentoEmpregadoMenorQue1100() throws Exception{
		ModeloEmpregado empre = new Empregados("Teste");
		empre.setValorPorHora(30.0);
		empre.setHoras(10);
		
		Assertions.assertEquals(1100.00,empre.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoIgualA1100() throws Exception{
		ModeloEmpregado empre = new Empregados("Teste");
		empre.setValorPorHora(100.0);
		empre.setHoras(11);
		
		Assertions.assertEquals(1100.00,empre.realizarPagamento());
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoValorPorHoraIgualA0(){
		String mensagemErro = "";
		try {
		ModeloEmpregado empre = new Empregados("Teste");
		empre.setHoras(30);
		empre.realizarPagamento();
		}catch (Exception e) {
			mensagemErro = e.getMessage();
		}
		Assertions.assertEquals("O valor por hora deve ser maior que 0",mensagemErro);
	}
//=======================================================================================================RealizarPagamento
	@Test
	public void realizarPagamentoEmpregadoHoraIgualA0(){
		String mensagemErro = "";
		try {
		ModeloEmpregado empre = new Empregados("Teste");
		empre.setValorPorHora(30.0);
		empre.realizarPagamento();
		}catch (Exception e) {
			mensagemErro = e.getMessage();
		}
		Assertions.assertEquals("A quantidade de horas deve ser maior que 0",mensagemErro);
	}
//=======================================================================================================SetHoras	
  	@Test
	public void TesteSetHorasEmpregado() throws Exception {
		empregado.setHoras(30);
		Assertions.assertEquals(30,empregado.getHoras());
	}
//=======================================================================================================SetHoras
	@Test
	public void TesteSetHorasEmpregadoMaiorQue40() {
		String MensagemErro = "";
		try {
		empregado.setHoras(45);
		}catch (Exception e) {
			MensagemErro =  e.getMessage();
		}
		Assertions.assertEquals("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.",MensagemErro);
	}
//=======================================================================================================	

  
  
  
  
  
  
  
  
}
