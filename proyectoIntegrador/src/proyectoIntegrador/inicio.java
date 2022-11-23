package proyectoIntegrador;

import java.util.*;

public class inicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mfx menu = new mfx();
		String input;
		gfx.loader();
		do {
			System.out.println(gfx.cyan +"\u001b[4m\u001b[1m             Menu Principal             \n" + gfx.reset);
			gfx.sleep(250);
			System.out.println(gfx.black+"\nOpcion 1:"+gfx.reset+" PC Gama Baja");
			gfx.sleep(250);
			System.out.println(gfx.black+"\nOpcion 2:"+gfx.reset+" PC Gama Media");
			gfx.sleep(250);
			System.out.println(gfx.black+"\nOpcion 3:"+gfx.reset+" PC Gama Alta");
			gfx.sleep(250);
			System.out.println(gfx.black+"\nOpcion 4:"+gfx.reset+" PC Gama Ultra");
			gfx.sleep(250);
			System.out.println(gfx.black+"\nSalir"+gfx.reset+"\n");
			gfx.spacer();
					
			input = sc.next().toLowerCase();
			switch (input) {
			case "1":
				gfx.loader();
				menu.low_m();
				break;
			case "2":
				gfx.loader();
				menu.mid_m();
				break;
			case "3":
				gfx.loader();
				menu.high_m();
				break;
			case "4":
				gfx.loader();
				menu.ultra_m();
				break;
			}
		} while (menu.mainExit(input));

		sc.close();
	}
}

		