
public class Main {

	public static void main(String[] args) {
		Party graduacion=new Party();
		DJAdapter d;
		DJ david=new David();
		d=new DJAdapter(david);
		graduacion.setParty(d);
		graduacion.preparar();
		graduacion.iniciar();
	}

}
