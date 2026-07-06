# Beecrowd 1180 — Menor e Posição

## Problema
O programa deve armazenar, em um vetor de n posições, uma quantidade n de números inteiros. Todos os valores serão diferentes entre si, e o programa 
deverá procurar o menor valor dentre os valores presentes no vetor e informar a posição dele.

## Abordagem
A primeira entrada é armazenada na variável n, que irá definir o tamanho do vetor utilizado na solução. Em seguida, cria-se um laço de repetição para armazenar as n entradas do programa dentro do vetor durante cada inserção.

Para encontrar o menor valor e sua posição, utilizei duas variáveis auxiliares: a variável pos, para armazenar a posição do menor valor encontrado, e a variável menor, para armazenar o menor valor encontrado.

O último laço de repetição irá percorrer o vetor por completo, verificando, em cada repetição, se o valor encontrado na posição i é menor do que o valor armazenado na variável menor. Em caso positivo, o valor encontrado será armazenado na variável menor, e o valor de pos será o valor de i, que corresponde à posição do menor valor encontrado.