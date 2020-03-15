package com.regis.estudojpa.dto;

public class CampanhaDTO {

	private long id;
	private String descricaoproduto;

	public CampanhaDTO(long id, String descricaoproduto) {
		this.id = id;
		this.descricaoproduto = descricaoproduto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CampanhaDTO other = (CampanhaDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CampanhaDTO [id=" + id + ", descricaoproduto=" + descricaoproduto + "]";
	}

}