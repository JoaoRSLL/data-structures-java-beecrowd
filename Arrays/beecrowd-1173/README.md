# Beecrowd 1173 — Preenchimento de Vetor I

## Problema
Ler um valor inteiro e armazená-lo na primeira posição de um vetor de 10 posições.
Em seguida, armazenar, nas posições subsequentes, um número inteiro que corresponda ao dobro
do valor armazenado na posição anterior.

## Abordagem
De início, foi instanciado um vetor de 10 posições, uma única entrada de valor inteiro e
definiu-se a primeira posição do vetor como o número lido na entrada, conforme definido no enunciado.
Na sequência, estruturei um loop para fazer o preenchimento do vetor seguindo a regra de duplicar
o valor da posição anterior. A posição inicial da variável de incremento corresponde à segunda
posição do vetor. A operação em repetição corresponde a definir a posição atual como o valor
da posição anterior (i - 1) multiplicado por 2.
Visando poupar memória e otimizar a execução, a primeira saída foi feita logo após o valor da entrada
ser inserido na primeira posição, e as saídas subsequentes foram realizadas logo após a operação
aritmética que definiu os valores a partir da segunda posição.
