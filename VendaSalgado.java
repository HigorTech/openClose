package OpenClose;

public class VendaSalgado {
	
	Salgado salgado;
	public int qtd;
	public double valorFinal;
	
	
	
	
	public VendaSalgado(Salgado salgado, int qtd) {
		super();
		this.salgado = salgado;
		this.qtd = qtd;
		valorFinal = 0;
	}




	public void  efetuarVenda(){
		
		valorFinal = salgado.valorVenda*qtd;
		
		System.out.println("Valor Final Venda:"+valorFinal);
		
	}
	
	public void  efetuarVendaCongelado(){
		
		double desconto = salgado.valorVenda*0.2;
		
		valorFinal = (salgado.valorVenda - desconto)*qtd;
		
		System.out.println("Valor Final Venda:"+valorFinal);
		
	}

}
