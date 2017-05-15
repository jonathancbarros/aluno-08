# SISU - Documentação

### Esse documento irá descrever de forma rápida e resumida como a implementação do sistema SISU funciona.

Primeiramente, não há interface, como classe Main, menu, etc. Portanto, o desenvolvedor que utilizar dessa implementação, decide por si próprio sobre a melhor forma de utilizar as classes existentes.

* As 4 classes existentes funcionam da seguinte forma:
  * Instituicao
    * É a abstração de uma Instituição de Ensino, contendo:
      * nome e id único.
    * Essa classe reserva uma collection ArrayList de forma estática como variável de classe para armazenar todas as instituições inseridas e tal collection poderá ser consultada através da classe Instituicao de forma glogal.
  * Curso
    * É a abstração de um Curso de determinada Instituição, contém:
      * nome, id único, idInstituicao, vagasOfertadas.
    * Essa classe é responsável por calcular o número de vagas reservadas e classificar os candidatos de acordo com suas opcões.
  * Candidato
    * É a abstração de um Candidato concorrendo a um Curso específico, contém:
      * nome, id único, escolaPublica (boolean), rendaPerCapita, idCursoPrimeiraOpcao, idCursoSegundaOpcao, tipoCota, notaEnem, etnia.
    * Essa classe é responsável por determinar e assegurar as informações passadas, como a verificação de cotas e opções de curso.
  * Sisu
    * Essa é a classe que faz todo o sistema funcionar, e funciona como a interface principal, os métodos contidos nela foram feitos para serem utilizados com arquivos em forma Json.
    * Os arquivos Json de Candidato, Curso e Instituicao precisam ter suas chaves definidas com os nomes de variáveis descritas anteriormente.
    * O desenvolvedor tem duas opçes aqui:
      * Chamar o construtor passando um json com as instituições, e em seguida invocar os métodos registrarCursos() e registrarCandidatos().
      * Ou chamar o construtor passando 3 arquivos de json, e então o sistema irá fazer os registros de acordo.
    * Após isso, ficam disponíveis os métodos realizarApuracao() e printListaDeAprovados().
