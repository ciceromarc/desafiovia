#language: pt
@regressaoWeb
Funcionalidade: Validação do Login e Logout do Produto VIA

	Contexto: Validação do Login e logout
		Dado que esteja na pagina "http://www.lourencodemonaco.com.br/vvtest/"

	@login
	Cenário: Validar login no sistema com credenciais válidas
		Quando preencher o usuario "111.111.111.111" e senha "12345"
	    Então devo acessar portal

	@logininvalido
	Cenário: Validar login no sistema com credenciais inválidas
		Quando preencher o usuario "222.222.222.222" e senha "54321"
		E devo acessar portal
		Então deve retornar mensagem "Não foi possível fazer a identificação com os dados informados."

	@logout
	Cenário: Validar logout no sistema
		Quando preencher o usuario "111.111.111.111" e senha "12345"
		E devo acessar portal
		Então devo clicar no botão sair
		E devo visualizar a pagina inicial do "ACESSO A PAGINA"