# Beecrowd 1172 — Substituição em Vetor I

## Problema
Ler um vetor de 10 posições, substituir todos os valores nulos e negativos por 1 e exibir os dados armazenados no vetor.

## Abordagem
Como a entrada está fixada em 10 valores, o vetor também é instanciado com
10 posições. Para povoá-lo, é utilizado um loop com parada definida igual
ao tamanho do vetor. Dentro do loop, o valor lido é armazenado na variável
`x`, que passa por uma condicional para verificar se é menor que 1. Em caso
positivo, é armazenado o valor 1 na posição `i` do vetor. Caso contrário,
é armazenado o próprio valor de `x`.
