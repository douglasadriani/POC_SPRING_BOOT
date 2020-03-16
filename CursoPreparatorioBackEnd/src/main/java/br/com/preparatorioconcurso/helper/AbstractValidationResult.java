package br.com.preparatorioconcurso.helper;

import java.io.Serializable;
import java.util.List;

public class AbstractValidationResult implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7399801927339011865L;

	private List<ValidationResult> listaValidationResult;
	
	private boolean valido;
	
	private String mensagens;

	public List<ValidationResult> getListaValidationResult() {
		return listaValidationResult;
	}

	public void setListaValidationResult(List<ValidationResult> listaValidationResult) {
		this.listaValidationResult = listaValidationResult;
	}

	public boolean isValido() {
		return this.valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public String getMensagens() {
		return mensagens;
	}

	public void setMensagens(String mensagens) {
		this.mensagens = mensagens;
	}
	
	public static void adicionaMensagen(String mensagens) {
		mensagens = mensagens +mensagens;
	}

	public void adicionarValidationResult(ValidationResult validationResult) {
		// TODO Auto-generated method stub
		
	}
	
	public AbstractValidationResult validar(ValidationResult... listaValidationResult) {
		
		AbstractValidationResult abstractValidationResult = new AbstractValidationResult();
		
		for (ValidationResult validationResult : listaValidationResult) {
			
			abstractValidationResult.adicionarValidationResult(validationResult);
			
			if( ! validationResult.isvalid() ) {
			
				abstractValidationResult.setMensagens(validationResult.getMesssage());
				abstractValidationResult.setValido(false);
				
			}
		}
		
		return abstractValidationResult;
	}

}
