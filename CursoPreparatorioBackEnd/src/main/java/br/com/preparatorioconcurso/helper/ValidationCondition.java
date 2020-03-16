package br.com.preparatorioconcurso.helper;

@FunctionalInterface
public interface ValidationCondition<K> {

	ValidationResult test(K param);

	default ValidationCondition<K> and(ValidationCondition<K> other) {
		return (param) -> {
			ValidationResult firstResult = this.test(param);
			return !firstResult.isvalid() ? firstResult : other.test(param);
		};
	}

	default ValidationCondition<K> or(ValidationCondition<K> other) {
		return (param) -> {
			ValidationResult firstResult = this.test(param);
			return firstResult.isvalid() ? firstResult : other.test(param);
		};
	}

}
