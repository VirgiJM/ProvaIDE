package figures;
a
import utilitats.Círculo;

public class Circunferencia {
	private double ràdio;

	public Circunferencia(double radio) {
		this.ràdio = radio;
	}

	public void imprimir() {
		String rojo = "rojo";
		String color = rojo;
		System.out.println("Diámetro: " + 2 * ràdio);
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * ràdio * ràdio;
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerar_Decimales, Circunferencia otro) {
		double radio1 = this.ràdio;
		double radio2 = otro.getRad();
		if (considerar_Decimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
