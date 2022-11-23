package proyectoIntegrador;

public class functions implements gfx {
	static comp data = new comp();
	static String gpu, cpu, pow, ram, mother, hdd, price;
	
	private static void pln(String s) {// Print Deco
		System.out.println(s);
	}
	public void minimenu(String x) {
		String mModifier = null;
		//x.toLowerCase();
		switch(x) {
		case "low":
			mModifier="Gama Baja";
			break;
		case "mid":
			mModifier="Gama Media";
			break;
		case "hi": 
			mModifier="Gama Alta";
			break;
		case "ult":
			mModifier="Gama Ultra";
			break;
		}
			
		pln(black+"\nOpcion 1: "+reset+"PC " +mModifier+" 1");
		gfx.sleep(150);
		pln(black+"\nOpcion 2: "+reset+"PC " +mModifier+" 2");
		gfx.sleep(150);
		pln(black+"\nAtras"+reset);
		gfx.sleep(150);
		pln(black+"\nSalir"+reset+"\n");
		gfx.sleep(150);
		gfx.spacer();
	}
	private static void Odata() {// OrderedData
		cpu = data.getCpu();
		gpu = data.getGpu();
		pow = data.getPow();
		ram = data.getRam();
		mother = data.getMother();
		hdd = data.getHdd();
		price = data.getPrice();
		
	}

	public void sglow_1() {// ShowGamaBaja1
		data.gamaBaja1();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Baja 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 1 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();

	}

	public void sglow_2() {// ShowGamaBaja2
		data.gamaBaja2();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Baja 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 2 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();

	}

	public void sgmid_1() {// ShowGamaMedia1
		data.gamaMedia1();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Media 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama Media 1 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();

	}

	public void sgmid_2() {// ShowGamaMedia2
		data.gamaMedia2();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Media 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama Media 2 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();

	}

	public void sghi_1() {// ShowGamaAlta1
		data.gamaAlta1();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Alta 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 1 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();

	}

	public void sghi_2() {// ShowGamaAlta2
		data.gamaAlta2();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Alta 2\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 1 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();
	}

	public void sgult_1() {// ShowGamaUltra1
		data.gamaUltra1();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Ultra 1\n"+reset);
		pln(reset+"Posee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 1 sería de "+cyan+price+reset);
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();
	}

	public void sgult_2() {// ShowGamaUltra2
		data.gamaUltra2();
		Odata();
		gfx.loader();
		pln(black+"\nPc Gama Ultra 2\n"+reset);
		pln(reset+"\nPosee un procesador " +cyan+cpu+reset);
		gfx.sleep(250);
		pln("Cuenta con "+cyan+ram+reset+" de RAM");
		gfx.sleep(250);
		pln("Una placa madre "+cyan+mother+reset);
		gfx.sleep(250);
		pln(cyan+gpu+reset+" como placa de video");
		gfx.sleep(250);
		pln("En cuanto a fuente tenemos la "+cyan+pow+reset);
		gfx.sleep(250);
		pln("El precio total por la pc de Gama baja 1 sería de "+cyan+price+reset+"\n");
		gfx.sleep(250);
		pln(black+"\nIngrese atras para volver al menu\n"+reset);
		gfx.spacer();
	}
}
interface gfx {
	public static String black = "\u001b[30m";
	public static String blue = "\u001b[34m";
	public static String reset= "\u001b[0m";
	public static String bline = black + "\n----------------------------------------------"+reset;
	public static String cyan = "\u001b[36m";
	public static String invis = "\u001b[40m";
	//public static String black = "uwu";
	public static void sleep(int snum) {// timer
		try {
			Thread.sleep(snum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void loader() {
		for(int i=0;i<20;i++) {
			System.out.print("\u001b[46m\u001b[36m«»");
			sleep(50);
		}
		System.out.println(reset+"\n");
	}
	public static void spacer() {
		System.out.print("\u001b[4m\u001b[1m"+cyan);
		for(int i=0;i<20;i++) System.out.print("  ");
		System.out.println(reset);
	}
	
}

