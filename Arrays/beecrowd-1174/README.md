# Beecrowd 1174 — Seleçao em Vetor I

## Problema
Ler um valor de numeros inteiros com 100 posições, e exibir na saida todas as posições que 
contenham numeros menores ou igual a 10 e em qual posição o valor se encontra.

## Abordagem
Para iniciar a solução, é necessário declarar um vetor do tipo real com 100 posições.
Na sequência, um laço de repetição percorre todas as posições do vetor. Em cada iteração, é feita a leitura de um valor da entrada, que será armazenado na posição i.
Após a leitura, o valor armazenado em A[i] é avaliado em uma condição. Se esse valor for menor ou igual a 10,
a posição i e o respectivo valor são exibidos na saída. Caso contrário, o laço segue para a próxima iteração.