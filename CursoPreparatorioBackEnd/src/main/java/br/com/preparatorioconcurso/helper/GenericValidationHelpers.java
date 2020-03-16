package br.com.preparatorioconcurso.helper;

import static java.lang.String.format;

import org.springframework.stereotype.Component;

@Component
public class GenericValidationHelpers {

	public ValidationCondition<String> notNull = PredicateValidation.from((s) -> s != null, "must not be null.");

	public ValidationCondition<String> moreThan(int size) {
		return PredicateValidation.from((s) -> s.length() >= size, format("must have more than %s chars.", size));
	}

	public ValidationCondition<String> lessThan(int size) {
		return PredicateValidation.from((s) -> s.length() <= size, format("must have less than %s chars.", size));
	}

	public ValidationCondition<String> between(int minSize, int maxSize) {
		return moreThan(minSize).and(lessThan(maxSize));
	}

	public ValidationCondition<String> contains(String c) {
		return PredicateValidation.from((s) -> s.contains(c), format("must contain %s", c));
	}
	
	public ValidationCondition<Integer> lowerThan(int max){
		return PredicateValidation.from((i) -> i < max, format("must be lower than %s.", max));
	}
	
	public ValidationCondition<Integer> greaterThan(int min){
		return PredicateValidation.from((i) -> i > min, format("must be greater than %s.", min));
	}
	
	public ValidationCondition<Integer> intBetween(int min, int max){
		return greaterThan(min).and(lowerThan(max));
	}
	
}
