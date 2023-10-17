package teste5;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Impressora {
	
	public void imprimirNota(CupomFiscal c) {
		 try {
		        if (c != null) {
		        	System.out.println("\t\t"+c.getNomeLoja());
		    		System.out.println("CNPJ:"+c.getCnpj());
		    		try {
		                LocalDateTime agora = LocalDateTime.now();
		                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		                String dataHoraFormatada = agora.format(formato);
		                System.out.println(dataHoraFormatada);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		    		System.out.println("----------------------------------------------");
		    		System.out.println("CNPJ/CPF consumidor: "+c.getCnpjConsumidor()+c.getCpfConsumidor());
		    		System.out.println("----------------------------------------------");
		    		System.out.println("\t\tCUPOM FISCAL");
		    		System.out.println("ITEM\t\tCÓDIGO\t\tDESCRIÇÃO");
		    		System.out.println("\t       QTDxUNITÁRIO\t    VALOR(R$)");
		    		System.out.println("----------------------------------------------");
		    		int aux = 1;
		    		for(Item item : c.getListaItem()) {
		    			String auxFormatada = String.format("%03d", aux);
		    			String codigoFormatado = String.format("%03d", item.getCodigo());
		    			String unitarioFormatado = String.format("%.2f", item.getValorUnitario());
		    			String valorTotalFormatado = String.format("%.2f", item.calculoValorTotal());
		    			System.out.println(auxFormatada+"\t\t"+codigoFormatado+" "+item.getNome());
		    			System.out.println("\t\t"+item.getQuantidade()+"x"+unitarioFormatado+"\t\t\t"+valorTotalFormatado);
		    			aux++;
		    		}
		    		String totalPagoFormatado = String.format("%.2f", c.getTotalPago());
		    		String dinheiroRecebidoFormatado = String.format("%.2f", c.getDinheiroRecebido());
		    		String trocoFormatado = String.format("%.2f", c.getTroco());
		    		System.out.println("TOTAL R$\t\t\t	"+totalPagoFormatado);
		    		System.out.println("\nVALOR RECEBIDO R$\t\t	"+ dinheiroRecebidoFormatado);
		    		System.out.println("TROCO R$\t\t\t	"+trocoFormatado);
		    		System.out.println("----------------------------------------------");
		        } else {
		            System.err.println("Erro: O objeto CupomFiscal é nulo.");
		        }
		    } catch (NullPointerException e) {
		        System.err.println("Erro: Ocorreu uma exceção de ponto nulo.");
		    }
		}
	public void imprimirNota(CupomFiscal c[]) {
		for(int i=0; i<c.length; i++) {
			try {
		        if (c[i] != null) {
		        	System.out.println("\t\t"+c[i].getNomeLoja());
		    		System.out.println("CNPJ:"+c[i].getCnpj());
		    		try {
		                LocalDateTime agora = LocalDateTime.now();
		                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		                String dataHoraFormatada = agora.format(formato);
		                System.out.println(dataHoraFormatada);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		    		System.out.println("----------------------------------------------");
		    		System.out.println("CNPJ/CPF consumidor: "+c[i].getCnpjConsumidor()+c[i].getCpfConsumidor());
		    		System.out.println("----------------------------------------------");
		    		System.out.println("\t\tCUPOM FISCAL");
		    		System.out.println("ITEM\t\tCÓDIGO\t\tDESCRIÇÃO");
		    		System.out.println("\t       QTDxUNITÁRIO\t    VALOR(R$)");
		    		System.out.println("----------------------------------------------");
		    		int aux = 1;
		    		for(Item item : c[i].getListaItem()) {
		    			String auxFormatada = String.format("%03d", aux);
		    			String codigoFormatado = String.format("%03d", item.getCodigo());
		    			String unitarioFormatado = String.format("%.2f", item.getValorUnitario());
		    			String valorTotalFormatado = String.format("%.2f", item.calculoValorTotal());
		    			System.out.println(auxFormatada+"\t\t"+codigoFormatado+" "+item.getNome());
		    			System.out.println("\t\t"+item.getQuantidade()+"x"+unitarioFormatado+"\t\t\t"+valorTotalFormatado);
		    			aux++;
		    		}
		    		String totalPagoFormatado = String.format("%.2f", c[i].getTotalPago());
		    		String dinheiroRecebidoFormatado = String.format("%.2f", c[i].getDinheiroRecebido());
		    		String trocoFormatado = String.format("%.2f", c[i].getTroco());
		    		System.out.println("TOTAL R$\t\t\t	"+totalPagoFormatado);
		    		System.out.println("\nVALOR RECEBIDO R$\t\t	"+ dinheiroRecebidoFormatado);
		    		System.out.println("TROCO R$\t\t\t	"+trocoFormatado);
		    		System.out.println("----------------------------------------------");
		        } else {
		            System.err.println("Erro: O objeto CupomFiscal é nulo.");
		        }
		    } catch (NullPointerException e) {
		        System.err.println("Erro: Ocorreu uma exceção de ponto nulo.");
		    }
		}
	}
}
