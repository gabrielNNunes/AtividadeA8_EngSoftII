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
  //=======================================================================================================
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoMaiorQue1100() throws Exception {
		EmpregadoTerceirizado empreTer = new EmpregadoTerceirizado("Teste");
		empreTer.setValorPorHora(150.0);
		empreTer.setHoras(10);
		empreTer.setAdicional(200.0);
		Assertions.assertEquals(1700.00,empreTer.realizarPagamento());
	}
//=======================================================================================================	
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoMenorQue1100() throws Exception{
		empregadoTerceirizado.setValorPorHora(30.0);
		empregadoTerceirizado.setHoras(30);
		empregadoTerceirizado.setAdicional(100.00);
		Assertions.assertEquals(1100.00,empregadoTerceirizado.realizarPagamento());
	}
//=======================================================================================================
	@Test
	public void realizarPagamentoEmpregadoTerceirizadoIgualA1100() throws Exception{
		empregadoTerceirizado.setValorPorHora(100.0);
		empregadoTerceirizado.setHoras(10);
		empregadoTerceirizado.setAdicional(100.00);
		Assertions.assertEquals(1100.00,empregadoTerceirizado.realizarPagamento());
	}
//=======================================================================================================

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
//=======================================================================================================
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
//=======================================================================================================
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
//=======================================================================================================		

  
  
  
  
  
  
}
