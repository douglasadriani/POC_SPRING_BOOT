package br.com.preparatorioconcurso.domain.service;

public class DiscountService {

	public int getDiscount(int amount) {
		 
		int discountPercentagem = 0;
		
		if(amount>5000 && amount<10000) {
			discountPercentagem = 10;
		
		}else if(amount>10000) {
			discountPercentagem = 15;
		}else {
			discountPercentagem = 0;
		}
		
		return discountPercentagem;
	}
}
