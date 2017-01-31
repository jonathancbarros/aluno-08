# Especificações de uma Queue em Java

### Uma queue, ou fila, é uma estrutura de dados relativamente simples que tem como objetivo imitar o comportamento de uma fila de pessoas na vida real, onde a primeira pessoa que chega - ou entra na fila - é a primeira que sai dela.

A implementação da fila é extremamente simples de ser implementada em Java para desenvolvedores que tenham conhecimentos básicos de Java e Estrutura de Dados. Para a implementação de uma fila usando orientação a objetos, as especificações são de acordo com o seguinte:

* Os métodos BÁSICOS para a implementação da fila são:
  * queue ()
    * Enfileirar - Recebe parâmetro de acordo com o que será inserido na fila, por exemplo: Em uma fila de alunos, o parâmetro recebido será uma instância do objeto Aluno, e então o adiciona no fim da fila. Se a fila tiver limite de tamanho - o que pode ser uma variável de controle, esse método poderá retornar verdadeiro ou falso caso tenha sucesso ou não, no entando, se não possuir limite de tamanho, então o método não retornará nada.
  * dequeue ()
    * Desenfileirar - Remove o objeto da fila na primeira posição e o retorna.
  * isEmpty ()
    * Vazia - Checa se a fila está vazia, podendo retornar verdadeiro ou falso.
* Você ainda pode incluir os métodos de size() e/ou get(), além de outras caso você precise uma fila mais personalizada.
* Sua implementação pode ser dada usando Array, LinkedList, Vector ou ArrayList contanto que suas restrições estejam bem aplicadas.

A API de Java possui uma implementação da Fila, podendo ser acessada através da biblioteca java.util.Queue com a java.util.LinkedList e possui os métodos .offer( ) para enfileirar, .poll( ) ou remove( ) para desenfileirar, element( ) ou peek( ) para retornar o elemento sem o retirar da fila e .isEmpty( ) para checar se a fila está vazia, além de outros métodos. 
