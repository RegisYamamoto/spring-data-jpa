package com.regis.estudojpa.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campanha {

	@Id
	private long id;
	
	private String descricaoproduto;
	private int idprodutogatilho;
	private int tipocampanha;
	private String descricaocampanha;
	private String precode;
	private String precopor;
	private Date datainicial;
	private Date datafinal;
	private int genericoespecifico;
	private int voucher;
	private BigDecimal porcentualdesconto;
	private BigDecimal quantidade;
	private BigDecimal quantidadegatilho;
	private BigDecimal quantidademaxima;
	private int tipodesconto;
	private int statusfilial;
	private int geo;
	private int bicon;
	
	@Column(name = "peso", columnDefinition = "TINYINT")
	private int peso;
	
	private long idcategoria;
	private int statusintegra;
	private int voucappx;
	private long voucnumb;
	
	

	public Campanha(long id, String descricaoproduto) {
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

	public int getIdprodutogatilho() {
		return idprodutogatilho;
	}

	public void setIdprodutogatilho(int idprodutogatilho) {
		this.idprodutogatilho = idprodutogatilho;
	}

	public int getTipocampanha() {
		return tipocampanha;
	}

	public void setTipocampanha(int tipocampanha) {
		this.tipocampanha = tipocampanha;
	}

	public String getDescricaocampanha() {
		return descricaocampanha;
	}

	public void setDescricaocampanha(String descricaocampanha) {
		this.descricaocampanha = descricaocampanha;
	}

	public String getPrecode() {
		return precode;
	}

	public void setPrecode(String precode) {
		this.precode = precode;
	}

	public String getPrecopor() {
		return precopor;
	}

	public void setPrecopor(String precopor) {
		this.precopor = precopor;
	}

	public Date getDatainicial() {
		return datainicial;
	}

	public void setDatainicial(Date datainicial) {
		this.datainicial = datainicial;
	}

	public Date getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(Date datafinal) {
		this.datafinal = datafinal;
	}

	public int getGenericoespecifico() {
		return genericoespecifico;
	}

	public void setGenericoespecifico(int genericoespecifico) {
		this.genericoespecifico = genericoespecifico;
	}

	public int getVoucher() {
		return voucher;
	}

	public void setVoucher(int voucher) {
		this.voucher = voucher;
	}

	public BigDecimal getPorcentualdesconto() {
		return porcentualdesconto;
	}

	public void setPorcentualdesconto(BigDecimal porcentualdesconto) {
		this.porcentualdesconto = porcentualdesconto;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getQuantidadegatilho() {
		return quantidadegatilho;
	}

	public void setQuantidadegatilho(BigDecimal quantidadegatilho) {
		this.quantidadegatilho = quantidadegatilho;
	}

	public BigDecimal getQuantidademaxima() {
		return quantidademaxima;
	}

	public void setQuantidademaxima(BigDecimal quantidademaxima) {
		this.quantidademaxima = quantidademaxima;
	}

	public int getTipodesconto() {
		return tipodesconto;
	}

	public void setTipodesconto(int tipodesconto) {
		this.tipodesconto = tipodesconto;
	}

	public int getStatusfilial() {
		return statusfilial;
	}

	public void setStatusfilial(int statusfilial) {
		this.statusfilial = statusfilial;
	}

	public int getGeo() {
		return geo;
	}

	public void setGeo(int geo) {
		this.geo = geo;
	}

	public int getBicon() {
		return bicon;
	}

	public void setBicon(int bicon) {
		this.bicon = bicon;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getStatusintegra() {
		return statusintegra;
	}

	public void setStatusintegra(int statusintegra) {
		this.statusintegra = statusintegra;
	}

	public int getVoucappx() {
		return voucappx;
	}

	public void setVoucappx(int voucappx) {
		this.voucappx = voucappx;
	}

	public long getVoucnumb() {
		return voucnumb;
	}

	public void setVoucnumb(long voucnumb) {
		this.voucnumb = voucnumb;
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
		Campanha other = (Campanha) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Campanha [id=" + id + ", descricaoproduto=" + descricaoproduto + ", idprodutogatilho="
				+ idprodutogatilho + ", tipocampanha=" + tipocampanha + ", descricaocampanha=" + descricaocampanha
				+ ", precode=" + precode + ", precopor=" + precopor + ", datainicial=" + datainicial + ", datafinal="
				+ datafinal + ", genericoespecifico=" + genericoespecifico + ", voucher=" + voucher
				+ ", porcentualdesconto=" + porcentualdesconto + ", quantidade=" + quantidade + ", quantidadegatilho="
				+ quantidadegatilho + ", quantidademaxima=" + quantidademaxima + ", tipodesconto=" + tipodesconto
				+ ", statusfilial=" + statusfilial + ", geo=" + geo + ", bicon=" + bicon + ", peso=" + peso
				+ ", idcategoria=" + idcategoria + ", statusintegra=" + statusintegra + ", voucappx=" + voucappx
				+ ", voucnumb=" + voucnumb + "]";
	}

}