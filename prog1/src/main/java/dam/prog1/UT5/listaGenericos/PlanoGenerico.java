package dam.prog1.UT5.listaGenericos;

public class PlanoGenerico<T> {

		T maxY, minY, maxX, minX;
		
		public PlanoGenerico(T maxY, T minY, T maxX, T minX) {
			this.maxY=maxY;
			this.minY=minY;
			this.maxX=maxX;
			this.minX=minX;
		}
		
		@Override
		public String toString() {
			return "Plano [maxY=" + maxY + ", minY=" + minY + ", maxX=" + maxX + ", minX=" + minX + "]";
		}

		public static void main(String[] args) {
			PlanoGenerico <Integer> planoDeEnteros= new PlanoGenerico(2,2,0,0);
			PlanoGenerico <Double>planoDecimales = new PlanoGenerico(2.5,2.5,0.0,0.0);
			
			System.out.println(planoDeEnteros);
			System.out.println(planoDecimales);
		}
		
}
