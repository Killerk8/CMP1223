package lista00;

public class Triangulo {
	float lado1, lado2, lado3;

	void criarTriangulo(float L1, float L2, float L3) {
		lado1 = L1;
		lado2 = L2;
		lado3 = L3;
	}

	boolean ehEquilatero() {
		boolean igual1, igual2, resultado;
		igual1 = (lado1 == lado2);
		igual2 = (lado2 == lado3);
		resultado = igual1 && igual2;
		return resultado;
	}

	boolean ehIsosceles() {
		boolean igual1, igual2, resultado;
		igual1 = ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3));
		igual2 = ((lado3 != lado1 && lado3 != lado2) || (lado2 != lado1 && lado2 != lado3)
				|| (lado1 != lado2 && lado1 != lado3));
		resultado = igual1 && igual2;
		return resultado;
	}

	boolean ehEscaleno() {
		boolean igual1, igual2, resultado;
		igual1 = ((lado1 != lado2 && lado1 != lado3));
		igual2 = (lado2 != lado3);
		resultado = igual1 && igual2;
		return resultado;
	}

	float calcularPerimetro() {
		float resultado = lado1 + lado2 + lado3;
		return resultado;
	}

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		t1.criarTriangulo(0, 10, 100);
		System.out.println(t1.ehEquilatero());
		System.out.println(t1.ehIsosceles());
		System.out.println(t1.ehEscaleno());
		System.out.println(t1.calcularPerimetro());
	}

}
