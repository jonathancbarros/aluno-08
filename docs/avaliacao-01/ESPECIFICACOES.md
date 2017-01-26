# Especificações de uma Queue em Java

### Uma queue, ou fila, é uma estrutura de dados relativamente simples que tem como objetivo imitar o comportamento de uma fila de pessoas na vida real, onde a primeira pessoa que chega - ou entra na fila - é a primeira que sai dela.

A implementação da fila é extremamente simples de ser implementada em Java para desenvolvedores que tenham conhecimentos básicos de Java e Estrutura de Dados. As especificações são de acordo com o seguinte:

* Os métodos básicos para a implementação da fila são:
  * Queue (Enfileirar)
    * Recebe parâmetro de acordo com o que será inserido na fila, por exemplo: Em uma fila de alunos, o parâmetro será uma instância do objeto Aluno e o adiciona no fim da fila.
  * Dequeue (Desenfileirar)
    * Remove o objeto da fila na primeira posição.
  * isEmpty (Está vazia)
    * Checa se a fila está vazia, podendo retornar verdadeiro ou falso.
* Sua implementação pode ser dada usando Array, LinkedList, Vector ou ArrayList contanto que suas restrições estejam bem aplicadas.

A API de Java possui uma implementação da Fila, podendo ser acessada através da biblioteca java.util.Queue com a java.util.LinkedList e possui os métodos .offer( ) para enfileirar, .poll( ) ou remove( ) para desenfileirar, element( ) ou peek( ) para retornar o elemento sem o retirar da fila e .isEmpty( ) para checar se a fila está vazia. 
