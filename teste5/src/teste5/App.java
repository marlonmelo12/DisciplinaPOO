package teste5;
import java.util.Scanner;


public class EntradaDadosException extends Exception{
 public EntradaDadosException(String mensagem) {
 super(mensagem);
 }
} 


public class App {
	public static String formatarCPF(String cpf) {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }
	
	public static String formatarCNPJ(String cnpj) {
		return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		CupomFiscal cupom = new CupomFiscal();
		double totalPago = 0.0;
		while(true) {
			Item item = new Item();
			System.out.println("Digite o código do item:");
			int codigo = scan.nextInt();
			item.setCodigo(codigo);
			System.out.println("Digite o nome do item:");
			scan.nextLine();
			String nome = scan.nextLine();
			item.setNome(nome);
			System.out.println("Digite o valor unitário do item:");
			double valorUnitario = scan.nextDouble();
			item.setValorUnitario(valorUnitario);
			System.out.println("Digite a quantidade:");
			int quantidade = scan.nextInt();
			item.setQuantidade(quantidade);
			totalPago+=item.getValorUnitario()*item.getQuantidade();
			cupom.adicionarItem(item);
			System.out.println("Deseja adicionar mais algum item? s/n");
			char op = scan.next().charAt(0);
			if(op != 's') {
				break;
			}
		}
		cupom.setTotalPago(totalPago);
		String totalGasto = String.format("%.2f", cupom.getTotalPago());
		System.out.println("Total gasto: R$"+totalGasto);
		System.out.println("Digite o nome da loja:");
		scan.nextLine();
		String nomeLoja = scan.nextLine();
		cupom.setNomeLoja(nomeLoja);
		System.out.println("Digite o CNPJ:");
		String cnpj = scan.nextLine();
		String cnpjFormatado = formatarCNPJ(cnpj);
		cupom.setCnpj(cnpjFormatado);
		System.out.println("Digite o CPF/CNPJ do consumidor:");
		String cadastro = scan.nextLine();
		if(cadastro.length()==11) {
			String cpfConsumidor = formatarCPF(cadastro);
			String cnpjConsumidor = "";
			cupom.setCpfConsumidor(cpfConsumidor);
			cupom.setCnpjConsumidor(cnpjConsumidor);
		}else {
			String cnpjConsumidor = formatarCNPJ(cadastro);
			String cpfConsumidor = "";
			cupom.setCnpjConsumidor(cnpjConsumidor);
			cupom.setCpfConsumidor(cpfConsumidor);
		}
		System.out.println("Digite o dinheiro recebido:");
		double dinheiroRecebido = scan.nextDouble();
		cupom.setDinheiroRecebido(dinheiroRecebido);
		double troco = cupom.getDinheiroRecebido() - cupom.getTotalPago();
		cupom.setTroco(troco);
		Impressora ip = new Impressora();
		ip.imprimirNota(cupom);
	}
}
