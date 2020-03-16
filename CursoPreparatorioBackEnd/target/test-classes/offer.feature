#language:pt
Funcionalidade: Evolução da porcentagem

  Cenario: Verifica valor abaixo de 10%
    Dado Executa a classe DiscountService de negocio
    
    Quando se eu entrar com 5001
    E se eu entrar com 6000
    Entao nos devemos receber 10% de desconto

  Cenario: Verify 15% offer
    Dado Executa a classe DiscountService de negocio
    Quando se eu entrar com 11000
    Entao nos devemos receber 15% de desconto

  Cenario: Verify No offer
    Dado Executa a classe DiscountService de negocio
    Quando se eu entrar com 6000
    Entao nos devemos receber algum desconto
    
  Cenario: Analise com o rodolfo sobre a porcentagem de desconto
    Dado Executa a classe DiscountService de negocio
    Quando se o rodolfo receber o salario com o valor de 6000
    Entao ele podera ter o desconto de 5% na fatura da internet
    
 Delineacao do Cenario: Title of your scenario outline
    Dado Executa a classe DiscountService de negocio
    Quando fonte <value>
    Entao valor desconto  <status>  de desconto

    Exemplos: 
      | value | status  |
      |  9000 | 10% |
      | 20000 | 15% |
