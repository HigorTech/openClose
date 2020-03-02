package OpenClose;

public class Salgado {
	
	private String tipoSalgado;
	public double valorVenda;
	
	
	
	
	
	public Salgado(String tipoSalgado, double valorVenda) {
		super();
		this.tipoSalgado = tipoSalgado;
		this.valorVenda = valorVenda;
	}
	
	
	public String getTipoSalgado() {
		return tipoSalgado;
	}
	public void setTipoSalgado(String tipoSalgado) {
		this.tipoSalgado = tipoSalgado;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	

}
