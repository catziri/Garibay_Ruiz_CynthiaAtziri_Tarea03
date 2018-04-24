
public class DJAdapter implements Music {
	DJ dj;

	public DJAdapter(DJ dj) {
		this.dj = dj;
	}

	@Override
	public void rentar() {
		dj.rentar();
	}

	@Override
	public void play() {
		dj.tocar();
	}

}
