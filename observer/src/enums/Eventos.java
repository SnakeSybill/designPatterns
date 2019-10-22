package enums;

public enum Eventos {

	ACABOU_CAFE(1, "acabou_cafe"), SAIU_CAFE_NOVO(1, "saiu_cafe_novo");

	private int codigo;
	private String descricao;

	Eventos(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
