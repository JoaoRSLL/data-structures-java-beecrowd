# Beecrowd 1259 — Pares e Ímpares

## Problema
Ler uma quantidade N de números inteiros não negativos. Ordenar essas numerações de maneira que os números pares deverão 
ser apresentados primeiro, em ordem crescente, seguidos pelos números ímpares em ordem decrescente.

## Abordagem
A base inicial da solução consiste em armazenar na variável n a quantidade de entradas no programa, definir um vetor de
inteiros vet com tamanho n para armazenar as entradas e duas variáveis auxiliares para contar a quantidade de numerações
ímpares e pares inseridas no programa, sendo elas cpar e cimpar.

Um laço de repetição é responsável por povoar o vetor até sua última posição, com um validador que incrementará a variável
cpar quando a entrada for um número par ou incrementará cimpar caso o número seja ímpar.

Em seguida, criei dois vetores para armazenar pares e ímpares em estruturas separadas, tendo seus tamanhos definidos pelas
variáveis auxiliares cpar e cimpar. Juntamente, adicionei mais duas variáveis adicionais (ppar e pimpar) para preservar os índices
de cada vetor durante o laço de repetição responsável por povoar os novos vetores.

O segundo laço de repetição irá povoar ambos os vetores. Ele percorrerá o vetor vet posição por posição, onde, em cada repetição,
caso o número armazenado seja par, ele será armazenado na posição ppar do vetor par, e ppar será incrementado em 1. O mesmo ocorre
caso o número seja ímpar, sendo armazenado no vetor impar, utilizando a variável pimpar.

Por fim, ambos os vetores, impar e par, passam pelo método Arrays.sort(). Em seguida, um laço de repetição exibe o vetor par da posição 0 até sua última posição (definida por ppar). Na sequência, o último laço de
repetição exibirá o vetor impar, começando pela sua última posição (definida por pimpar - 1) até chegar à posição 0.