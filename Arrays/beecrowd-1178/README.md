# Beecrowd 1178 — Preenchimento de Vetor III

## Problema
O programa deve ler um valor t e preencher um vetor com 1000 posições com a sequência de
valores de 0 até t - 1, repetidas vezes, em que t pode ser um valor entre 2 e 50.

## Abordagem
A estrutura para a solução foi feita com um vetor do tipo inteiro com 1000 posições, uma variável t para armazenar o valor de referência da sequência e a variável cont para auxiliar no reset da repetição da sequência.
Ao iniciar o loop responsável por povoar o vetor, a posição i sempre receberá o valor da variável cont, que foi instanciada previamente em 0. Em seguida, é feita a saída correspondente à posição atual do vetor e ao seu respectivo valor.
Após a saída, é feito o incremento do valor de cont, que passa por um validador para verificar se cont se iguala ao valor de t. Em caso positivo, cont volta para 0, reiniciando a sequência a ser inserida no vetor e mantendo o valor máximo de cont em t - 1.