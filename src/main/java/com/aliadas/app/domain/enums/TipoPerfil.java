package com.aliadas.app.domain.enums;

public enum TipoPerfil {

	PERFIL_ALIADA(1, "Perfil da aliada"), 
	PERFIL_CANDIDATA(2, "Perfil da candidata"),
	PERFIL_ADMIN(3, "Perfil da administradora")
	;

	private int codigo;

	private String descricao;

	private TipoPerfil(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPerfil toEnum(Integer codigo) {
		if (codigo==null) {
			return null;
		}
		
		for (TipoPerfil tp : TipoPerfil.values()) {
			if(codigo.equals(tp.getCodigo())) {
				return tp;
			}
		}
		
		throw new IllegalArgumentException("Código de Tipo de Usuário Inválido : "+codigo);		
	}

}
