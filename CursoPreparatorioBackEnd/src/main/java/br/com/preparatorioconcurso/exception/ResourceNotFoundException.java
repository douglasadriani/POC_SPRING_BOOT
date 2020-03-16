package br.com.preparatorioconcurso.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = -3297503046103068431L;

	public ResourceNotFoundException(String message) {
    super(message);
  }
	
}
