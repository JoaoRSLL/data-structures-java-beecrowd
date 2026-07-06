# Beecrowd 1175 — Troca em Vetor I

## Problema
Gerar um vetor de 20 posições e, após o preenchimento de todas elas, realizar a troca dos elementos em ordem inversa: 
o primeiro elemento deve ser trocado com o último, o segundo com o penúltimo, 
e assim sucessivamente, até a troca do 10º elemento com o 11º. Ao final, devem ser exibidas na saída todas as posições do vetor e seus respectivos valores.

## Abordagem
O vetor utilizado possui tamanho fixo de 20 posições. A resolução foi dividida em três laços de repetição.
No primeiro laço, são realizadas as 20 inserções de dados no vetor.
No segundo laço, são feitas 10 repetições para inverter os valores do vetor. 
Para isso, uma variável temporária armazena o valor da posição atual, representada pela variável i. 
Em seguida, a posição atual recebe o valor armazenado na posição 19 - i, que representa a posição correspondente no lado oposto do vetor. 
Por fim, a posição 19 - i recebe o valor armazenado na variável temporária.
O último laço é responsável pela saída dos dados, exibindo cada posição do vetor e seu respectivo valor.