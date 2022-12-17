package br.com.desafio.poo;

public class Curso extends Conteudo {
	private String Titulo ;
	
	private String Descricao;
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	@Override
	public double calcularXp() {
		return XP_PADRAO * this.cargaHoraria;
	}
	@Override
	public double calculaXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
