package exercicoAvaliativo;

import java.util.List;

public class pais {

	private String codigoISO;
	private String nome;
	private double populacao;
	private double dimensao;
	private List<pais> fronteiras;

	pais(String codigoISO, String nome, double dimensao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public List<pais> getFronteiras() {
		return fronteiras;
	}

	public void setFronteiras(List<pais> fronteiras) {
		this.fronteiras = fronteiras;
	}

	public void verificarIgualdade() {
		if (codigoISO.equals(codigoISO)) {

			System.out.println("os países sao iguais");

		}
	}
	public double densidadePop() {
		double densidade = populacao / dimensao;
		System.out.println("densidade populacional: " + densidade);
		return densidade;
	}
	
	public boolean limitrofe(pais outroPais) {
		return fronteiras.contains(outroPais);
	}
	
	
	
//	d) Um método que informe se outro país é limítrofe do país informado;
//
//	f) Um método que receba um país como parâmetro e retorne a lista de
//
//	vizinhos comuns aos dois países.
//
//	Considere que um país tem no máximo 10 outros países com os quais ele faz fronteira ().


  }
