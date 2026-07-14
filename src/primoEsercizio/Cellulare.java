package primoEsercizio;

public class Cellulare {
	private double creditoDisponibile;
	private int chiamateEffettuate;
	private double tariffa;

	public void ricaricaCellulare(int importo) {
		if (importo == 5 || importo == 10 || importo == 25) {
			creditoDisponibile += importo;
			System.out.println("--------------------------------");
			System.out.println("Ricarica effettuata con un importo di: " + importo);
			System.out.println("--------------------------------");
		} else {

			System.out.println("--------------------------------");
			System.out.println("Importo non Valido");
			System.out.println("--------------------------------");

		}
	}

	public void impostaTariffa(double centesimiAlMinuto) {
		tariffa = centesimiAlMinuto / 100.0;
		System.out.println("--------------------------------");
		System.out.println("Tariffa Impostata a " + tariffa + "/minuto");
		System.out.println("--------------------------------");
	}

	public void effettuaChiamata(String numero, int minuti) {
		int lunghezzanumero = numero.length();
		if (tariffa <= 0 || creditoDisponibile <= 0) {
			System.out.println("Il Credito non è sufficiente o la tariffa non è corretta");
		} else {
			if (lunghezzanumero > 8 && lunghezzanumero < 15) {
				double costoTeorico = minuti * tariffa;

				if (costoTeorico <= creditoDisponibile) {

					System.out.println("--------------------------------");
					creditoDisponibile -= costoTeorico;
					chiamateEffettuate++;
					System.out.println("Hai effettuato una chiamata al numero: " + numero);
					System.out.println("--------------------------------");
				} else {

					System.out.println("--------------------------------");
					System.out.println("Credito Insufficiente");
					System.out.println("--------------------------------");

				}
			}
			else {
				System.out.println("--------------------------------");
				System.out.println("Numero Non Valido, Il numero deve essere di almeno 8 caratteri, massimo 15");
				System.out.println("--------------------------------");

			}

		}

	}

	public void stampaCreditoDisponibile() {

		System.out.println("--------------------------------");
		System.out.println("Il Tuo credito disponibile attuale è di: " + creditoDisponibile);
		System.out.println("--------------------------------");
	}

	public void stampaChiamateEffettuate() {

		System.out.println("--------------------------------");
		System.out.println("Numero chiamate effettuate: " + chiamateEffettuate);
		System.out.println("--------------------------------");
	}

	public void azzeraChiamate() {
		chiamateEffettuate = 0;
		System.out.println("--------------------------------");
		System.out.println("Numero Chiamate Azzerato");
		System.out.println("--------------------------------");
		stampaChiamateEffettuate();
	}
}