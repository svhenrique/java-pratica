package Volume;

public class Cilindro {
	
	protected static float PI = 3.14f;
	private float altura;
	private float raio;
	
	public Cilindro(float altura, float raio) {
		this.set_altura(altura);
		this.set_raio(raio);
	}
	
	public float get_altura() {
		return this.altura;
	}
	
	
	public float get_raio() {
		return this.raio;
	}
	
	public void set_altura(float altura) {
		this.altura = altura;
	}
	
	
	public void set_raio(float raio) {
		this.raio = raio;
	}
	
	public float area() {
		float area = PI * this.get_raio() * this.get_raio();
		return area;
	}
	
	public float volume() {
		float volume = this.area() * this.get_altura();
		return volume;
	}
	
}