package figures;

import utilitats.C�rculo;

public class Circunferencia {
	private double r�dio;

	public Circunferencia(double radio) {
		this.r�dio = radio;
	}

	public void imprimir() {
		String rojo = "rojo";
		String color = rojo;
		System.out.println("Di�metro: " + 2 * r�dio);
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * r�dio * r�dio;
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerar_Decimales, Circunferencia otro) {
		double radio1 = this.r�dio;
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