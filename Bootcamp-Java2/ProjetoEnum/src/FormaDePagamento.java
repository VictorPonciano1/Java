
public enum FormaDePagamento {

	//SINTAXE DE COMO ATRIBUIR VALORES AO ENUM;
	DINHEIRO ("001","Pagamento em Dinheiro"),
	CARTAO_CREDITO("002","Pagando com Cartão de Crédito"),
	CARTAO_DEBITO("003","Pagamento com Cartão de Débito"),
	PIX("004","Transferência via Pix");
	
	//CODIGO E DESCRICAO CRIADOS COMO "FINAL" POIS NUNCA IRAO MUDAR (IGUAL AO ENUM);	
	private final String codigo;
	private final String descricao;
	
	//NECESSARIO CRIAR UM METODO CONSTRUTOR PARA "SALVAR" QUE OS VALORES SERAO PREENCHIDOS;
	FormaDePagamento (String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	//CHAMADA DO GET (SET NAO SERA PRECISO POIS OS VALORES ESTAO EM FINAL);
	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
