# Beecrowd 1171 — Contando Números

**Estrutura de dados:** Array
**Dificuldade:** Iniciante

## Problema
Ler N números inteiros e informar quantas vezes cada valor distinto aparece
na entrada, exibindo o resultado em ordem crescente de valor.

## Abordagem
Os números são armazenados em um array e ordenados com `Arrays.sort()`. Em
seguida, percorro o array uma única vez comparando cada elemento com o
anterior: enquanto os valores forem iguais, incremento um contador; ao
encontrar um valor diferente, imprimo a contagem do valor anterior e reinicio
o contador. Como o array já está ordenado, os valores distintos saem
naturalmente em ordem crescente, sem necessidade de estruturas extras (como
HashMap) para agrupar as ocorrências.