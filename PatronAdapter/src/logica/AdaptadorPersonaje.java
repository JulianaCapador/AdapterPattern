package logica;

public class AdaptadorPersonaje extends Personaje{

	//Creacion del objeto Mago
		private Mago mago;
		private Orco orco;
		
		
		public AdaptadorPersonaje(){
			super();
			this.mago = new Mago();
			//this.orco = new Orco();
		}

		@Override
		public void caminar() {
			this.mago.Flotar();
			//this.orco.Golpear();
		}

		@Override
		public void atacar() {
			this.mago.Lanzar();
			//this.orco.Golpear();
			
		}
}
