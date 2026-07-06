# Beecrowd 1179 — Preenchimento de Vetor IV

## Problema
O problema consiste em armazenar 15 entradas de números inteiros em dois vetores diferentes: um vetor para armazenar números pares e outro para armazenar números ímpares. Ambos os vetores possuem apenas 5 posições. 
Toda vez que um deles for preenchido completamente, o programa deve exibir todos os dados armazenados no vetor e limpar suas numerações na sequência.
Ao final das inserções, o programa deve exibir os dados restantes em cada vetor, começando pelo vetor ímpar.
## Abordagem
Como base do programa, foram instanciados os vetores de números inteiros par e impar, ambos com 5 posições. Também utilizei duas variáveis auxiliares para armazenar as posições de cada vetor durante as repetições, sendo elas pospar e posimpar.

O primeiro laço de repetição será executado 15 vezes. Sua primeira linha contém uma variável para receber a entrada atual. Após armazenar o valor da entrada, o programa irá validar se o valor inserido é par ou ímpar, por meio de uma condicional de operação de divisão com resto.

Após definir se a entrada é ímpar ou par, o procedimento é o mesmo para cada lado da condicional. A variável de entrada será inserida na posição do vetor correspondente ao valor da variável auxiliar de posição. Em seguida, a variável auxiliar será incrementada e, caso se iguale a 5, valor maior do que o tamanho dos vetores, um novo laço de repetição irá realizar a saída de todos os dados armazenados no vetor correspondente. Na sequência, a variável auxiliar retorna ao valor 0, e o vetor é preenchido com 0 em todas as suas posições por meio do método Arrays.fill().

Por fim, outros dois laços de repetição, com parada definida para ser menor do que o valor atual da variável auxiliar de posição de cada vetor, são responsáveis por exibir as numerações restantes em ambos os vetores.