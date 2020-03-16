package br.com.preparatorioconcurso.helper;

import java.util.function.Predicate;

public class PredicateValidation<K> implements ValidationCondition<K> {

	private Predicate<K> predicate;
	private String onErrorMessage;
	
	public static <K> PredicateValidation<K> from(Predicate<K> predicate, String onErrorMessage) {
		 return new PredicateValidation<K>(predicate, onErrorMessage);
	}
	
	private PredicateValidation(Predicate<K> predicate, String onErrorMessage) {
		this.predicate = predicate;
		this.onErrorMessage = onErrorMessage;
	}
	
	@Override
	public ValidationResult test(K param) {
		return predicate.test(param) ? ValidationResult.ok() : ValidationResult.fail(onErrorMessage);
	}

}
