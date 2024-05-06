package dam.prog1.UT8.excepciones.Pandilla;

public class InitPandilla {

	public static void main(String[] args) {
		
		Pandilla colegotes = new Pandilla(5);
		Amigo a1 = new Amigo("Antonio","Cejas");
		Amigo a2 = new Amigo("Alvaro","Kr");
		Amigo a3 = new Amigo("Blanca","Blanquita");
		Amigo a4 = new Amigo("Alessandro","Aless");
		Amigo a5 = new Amigo("Carmen","Carmencita");
		Amigo a6 = new Amigo("Daniel","Dani");
		Amigo a7 = new Amigo("Carlos","Carlitos");
		
		try {
			colegotes.addAmigo(a1);
			colegotes.addAmigo(a2);
			colegotes.addAmigo(a3);
			colegotes.addAmigo(a4);
			//colegotes.addAmigo(a6); //Salta la capacidad
			colegotes.addAmigo(a7); //Salta la del nombre
			colegotes.addAmigo(a5);
			
			System.out.println("Somos " + colegotes.size());
			
		} catch (PandillaCompletaException | NoMeGustaTuNombreException e ) {
			e.getMessage();
			e.printStackTrace();
		} 

	}

}
