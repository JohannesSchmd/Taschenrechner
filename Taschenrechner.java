package taschenrechnerS1;

import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {

		Scanner benutzereingabe = new Scanner(System.in);

		String eingabenSpeicher;
		String op;
		String weiterMachen = "ja";
		boolean möglich;

		Rechnungen zahlenSetzen = new Rechnungen(); // Hilfsobjekt
		Texte textAbrufen = new Texte();
		
		while (weiterMachen.equals("ja")) {

			do {
				System.out.println(textAbrufen.getOperator());
				op = benutzereingabe.next();
				if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("sum")
						|| op.equals("prod") || op.equals("quer") || op.equals("prim")) {
					möglich = true;
				} else {
					System.out.println(textAbrufen.getCorrectOperator());
					möglich = false;
				}
			} while (möglich == false);

			switch (op) {

			case "+":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);

				do {
					System.out.println(textAbrufen.get2Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl2(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}

				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.addition());
				break;

			case "-":
				do {
				System.out.println(textAbrufen.get1Zahl());
				eingabenSpeicher = benutzereingabe.next();

				try {
					if (eingabenSpeicher.equalsIgnoreCase("erg")) {
						zahlenSetzen.setZahl1(zahlenSetzen.getErg());
					} else {
						zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
					}
					möglich = true;
				} catch (NumberFormatException e) {
					System.out.println(textAbrufen.getCorrectNumber());
					möglich = false;
				}
			} while (möglich == false);

			do {
				System.out.println(textAbrufen.get2Zahl());
				eingabenSpeicher = benutzereingabe.next();

				try {
					if (eingabenSpeicher.equalsIgnoreCase("erg")) {
						zahlenSetzen.setZahl2(zahlenSetzen.getErg());
					} else {
						zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
					}
					möglich = true;
				} catch (NumberFormatException e) {
					System.out.println(textAbrufen.getCorrectNumber());
					möglich = false;
				}

			} while (möglich == false);
			System.out.println(textAbrufen.getErgText() + zahlenSetzen.subtraction());
			break;
				
			case "*":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);

				do {
					System.out.println(textAbrufen.get2Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl2(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}

				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.multiplication());
				break;
			case "/":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);

				do {
					do {
					System.out.println(textAbrufen.get2Zahl());
					eingabenSpeicher = benutzereingabe.next();
					if(eingabenSpeicher.equals("0")) {
						System.out.println(textAbrufen.getCorrectQuotient());
						möglich = false;
					}
					else {
						möglich = true;
					}
					}while (möglich == false);
					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl2(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}

				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.division());
				break;
			case "sum":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);

				do {
					System.out.println(textAbrufen.get2Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl2(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}

				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.sum());
				break;
			case "prod":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);

				do {
					System.out.println(textAbrufen.get2Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl2(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl2(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}

				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.prod());
				break;
			case "quer":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.quer());
				break;
			case "prim":
				do {
					System.out.println(textAbrufen.get1Zahl());
					eingabenSpeicher = benutzereingabe.next();

					try {
						if (eingabenSpeicher.equalsIgnoreCase("erg")) {
							zahlenSetzen.setZahl1(zahlenSetzen.getErg());
						} else {
							zahlenSetzen.setZahl1(Integer.parseInt(eingabenSpeicher));
						}
						möglich = true;
					} catch (NumberFormatException e) {
						System.out.println(textAbrufen.getCorrectNumber());
						möglich = false;
					}
				} while (möglich == false);
				System.out.println(textAbrufen.getErgText() + zahlenSetzen.prim());
				break;
			}

			do {
				System.out.println(textAbrufen.getAntwortWeiterMachen());
				weiterMachen = benutzereingabe.next();

				switch (weiterMachen) {
				case "ja":
					möglich = true;
					break;
				case "nein":
					möglich = true;
					break;
				default:
					System.out.println(textAbrufen.getCorrectAntwort());
					möglich = false;
				}
			} while (möglich == false);
		}
		System.out.print(textAbrufen.getEnde());
		benutzereingabe.close();
		
	}
	
}
