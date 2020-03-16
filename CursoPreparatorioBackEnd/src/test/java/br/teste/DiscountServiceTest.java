package br.teste;

import org.junit.Assert;

import br.com.preparatorioconcurso.domain.service.DiscountService;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DiscountServiceTest {

	DiscountService service;
	int percentagem = 0;

	@Dado("^Executa a classe DiscountService de negocio$")
	public void executa_a_classe_DiscountService_de_negocio() throws Throwable {
		service = new DiscountService();
	}

	@Quando("^se eu entrar com (\\d+)$")
	public void se_eu_entrar_com(int amount) throws Throwable {
		percentagem = service.getDiscount(amount);
	}

	@Entao("^nos devemos receber (\\d+)% de desconto$")
	public void nos_devemos_receber_de_desconto(int arg1) throws Throwable {
		Assert.assertEquals(arg1, percentagem);
	}

	@Entao("^nos devemos receber algum desconto$")
	public void nos_devemos_receber_algum_desconto() throws Throwable {
		Assert.assertTrue(percentagem > 0);
	}

	@Quando("^fonte (\\d+)$")
	public void fonte(int arg1) throws Throwable {
		percentagem = service.getDiscount(arg1);
	}

	@Entao("^valor desconto  (\\d+)%  de desconto$")
	public void valor_desconto_de_desconto(int arg1) throws Throwable {
		Assert.assertEquals(arg1, percentagem);
	}

	@Quando("^se o rodolfo receber o salario com o valor de (\\d+)$")
	public void se_o_rodolfo_receber_o_salario_com_o_valor_de(int arg1) throws Throwable {
		Assert.assertEquals(arg1, percentagem);
	}

	@Entao("^ele podera ter o desconto de (\\d+)% na fatura da internet$")
	public void ele_podera_ter_o_desconto_de_na_fatura_da_internet(int arg1) throws Throwable {
		Assert.assertEquals(arg1, percentagem);
	}

}
