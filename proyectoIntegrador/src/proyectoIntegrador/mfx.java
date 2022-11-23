package proyectoIntegrador;

import java.util.Scanner;

public class mfx {
	static Scanner sc = new Scanner(System.in);
	static functions fx = new functions();

	public boolean mainExit(String x) {
		Boolean ret = x.toLowerCase().equals("salir");
		return !ret;
	}

	public boolean checker(String x) {
		if (x.toLowerCase().equals("salir"))
			System.exit(0);
		Boolean ret = x.toLowerCase().equals("atras");
		return !ret;
	}

	public void low_m() {
		String input, checkMenu = "a";
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                Gama Baja               \n" + gfx.reset);
			fx.minimenu("low");
			input = sc.next().toLowerCase();
			switch (input) {
			case "1":
				do{
					switch (checkMenu){
				case "a":
					fx.sglow_1();
					checkMenu = sc.next().toLowerCase();
				case "comprar":
					gfx.loader();
					System.out.println("Gracias por su compra en Bugax Tienda");
					gfx.spacer();
					System.exit(0);
					//compras.menuGamaBaja1();
					/*
					 * confirme su compra por price
					 * ingrese su dni 
					 * su nombre 
					 * tarjeta de credito
					 */
					break;
					}
				}while(checker(checkMenu));
				break;
			case "2":
				do {
					fx.sglow_2();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}

	public void mid_m() {
		String input, checkMenu;
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m               Gama Media               \n" + gfx.reset);
			fx.minimenu("mid");
			input = sc.next().toLowerCase();
			switch (input) {
			case "1":
				do {
					fx.sgmid_1();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			case "2":
				do {
					fx.sgmid_2();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			}
		}while(checker(input));
	}

	public void high_m() {
		String input, checkMenu;
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m                Gama Alta               \n" + gfx.reset);
			fx.minimenu("hi");
			input = sc.next().toLowerCase();
			switch (input) {
			case "1":
				do {
					fx.sghi_1();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			case "2":
				do {
					fx.sghi_2();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}

	public void ultra_m() {
		String input, checkMenu;
		do {
			System.out.println("\n"+gfx.cyan +"\u001b[4m\u001b[1m               Gama Ultra               \n" + gfx.reset);
			fx.minimenu("ult");
			input = sc.next().toLowerCase();
			switch (input) {
			case "1":
				do {
					fx.sgult_1();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			case "2":
				do {
					fx.sgult_2();
					checkMenu = sc.next().toLowerCase();
				}while(checker(checkMenu));
				break;
			}
		} while (checker(input));
	}
}
