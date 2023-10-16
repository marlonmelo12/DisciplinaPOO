package registro;

import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) {
		Colaborador [] colaboradores = new Colaborador[4];
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.set(2000, 12, 11);
		GregorianCalendar cal2 = new GregorianCalendar();
		cal2.set(1999, 05, 11);
		GregorianCalendar cal3 = new GregorianCalendar();
		cal3.set(1995, 04, 11);
		
		colaboradores[0] = new Colaborador("078.406.703-18", "Marlon Melo", 1300, cal1);
		colaboradores[1] = new Colaborador("123.321.432-23", "Samuel", 1200, cal2);
		colaboradores[2]= new Colaborador("321.543.123-12", "Germano", 1300, cal3);
		colaboradores[3] = new Colaborador("078.406.703-18", "Marlon Melo", 1300, cal1);
		OperacaoColaborador.trabalhaMaisTempo(colaboradores);
		OperacaoColaborador.validarDados(colaboradores);
		OperacaoColaborador.verificarCPF(colaboradores, "123.321.432-23");
		
		
	}

}
