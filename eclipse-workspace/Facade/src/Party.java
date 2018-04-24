
public class Party {
	  Venue v=new Benavento();
	    Decoracion d=new Serpentina();
	    Music m;
	    Luces l=new Neon();
	    Bebida b=new Refresco();
	    Seguridad s=new Alcones();
	    public Party() {
	    	
	    }
	    public void setParty(Music m) {
	    	this.m=m;
	    }
	    public void preparar() {
	   	 b.comprar();
	   	 v.rentar();
	   	 v.pagar();
	   	 m.rentar();
	   	 d.comprar();
	   	 d.instalar();
	   	 l.rentar();
	   	 s.rentar();
	    }
	    public void iniciar() {
		 b.servir();	
		 m.play();
		 l.prender();
	    }
}
