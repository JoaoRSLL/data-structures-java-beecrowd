# Beecrowd 1176 — Fibonacci em Vetor

## Problema
O problema consiste em receber uma entrada que define a quantidade de casos de teste, seguida por x valores inteiros. Para cada valor informado, 
o programa deve exibir o número de Fibonacci correspondente à posição indicada.

## Abordagem
O problema define que o maior valor possível de entrada é 60. Portanto, foi criado um vetor com 61 posições, já que os índices dos vetores em Java começam em 0.
As posições 0 e 1 do vetor são pré-definidas, respectivamente, com os valores 0 e 1, atendendo à definição inicial da sequência de Fibonacci.
Em seguida, um laço de repetição é utilizado para preencher o vetor a partir da posição 2. Cada posição i recebe a soma das duas posições anteriores, ou seja, fib[i - 1] + fib[i - 2].
Após finalizar o preenchimento do vetor, é feita a leitura da variável responsável por armazenar o número de casos de teste.
Por fim, um novo laço é iniciado para ler os valores inteiros que serão utilizados como parâmetros. Para cada valor lido, o programa exibe na saída a posição da sequência de Fibonacci e seu valor correspondente.