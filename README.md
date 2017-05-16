# SISU - Documentação

### Esse documento irá descrever de forma rápida e resumida como a implementação do sistema SISU funciona.

Primeiramente, não há interface, como classe Main, menu, etc. Portanto, o desenvolvedor que utilizar dessa implementação, decide por si próprio sobre a melhor forma de utilizar as classes existentes.

* As 4 classes existentes funcionam da seguinte forma:
  * Instituicao
    * É a abstração de uma Instituição de Ensino, contendo:
      * nome e id único.
  * Curso
    * É a abstração de um Curso de determinada Instituição, contém:
      * nome, id único, idInstituicao, vagasOfertadas.
    * Essa classe é responsável por calcular o número de vagas reservadas e classificar os candidatos de acordo com suas opcões.
    * Essa classe possui dois métodos de inicializacao com o mesmo nome setUp() onde recebem: 
      - objeto do tipo Curso, ou uma lista com objetos do tipo Curso. E então já faz automaticamente o cálculo das vagas.
    * Posteriormente, o desenvolvedor pode chamar o método de apuração de resultado realizarApuracao().
  * Candidato
    * É a abstração de um Candidato concorrendo a um Curso específico, contém:
      * nome, id único, escolaPublica (boolean), rendaPerCapita, idCursoPrimeiraOpcao, idCursoSegundaOpcao, tipoCota, notaEnem, etnia.
    * Essa classe é responsável por determinar e assegurar as informações passadas, como a verificação de cotas e opções de curso.
  * Sisu
    * Essa é uma classe muito simples que serve apenas para chamar os inicializadores de cada classe a partir de um único construtor, o construtor foi projetado para ser utilizado com arquivos em formato Json.
    * Os arquivos Json de Candidato, Curso e Instituicao precisam ter suas chaves definidas com os nomes de variáveis descritas anteriormente.
* O desenvolvedor então tem duas opçes aqui:
   * Chamar o construtor de Sisu() passando 3 arquivos de json, e então o sistema irá fazer os registros de acordo.
   * Ou chamar o método setUp() para cada classe, seguindo a ordem: Instituição, Curso, e Candidatos.
   * Após isso, ficam disponíveis os métodos realizarApuracao() e imprimirListaDeAprovados() de forma estática na classe Curso.
