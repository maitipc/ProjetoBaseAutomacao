#language: pt
#Version: 1.0
#Author: Maiti Puertas Crucelli
#Encoding: iso-8859-1
Funcionalidade: Realizar Cadastro Completo de um Novo Cliente

  Contexto: 
    Dado que estou logado no portal com as credenciais
      | usuario 							| senha 			|
      | usuarioTeste				  | senhaTeste 	|

  @ID001 @ProcurarCursos @BDD @MassaReaproveitavel
  Cenario: Procurar um curso
    Quando procurar um curso
      | curso				|
      | Illustrator	|
    Entao e exibido no portal a lista de cursos disponiveis

 