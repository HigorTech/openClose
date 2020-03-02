package OpenClose;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Salgado s1 = new Salgado("Coxinha",1.5);
		
		VendaSalgado v1 = new VendaSalgado(s1,5);
		
		v1.efetuarVenda();
		
		VendaSalgado v2 = new VendaSalgado(s1,5);
		
		v2.efetuarVendaCongelado();
		
		
		

		
		

	}

}
