import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumaTest {

	@Test
	public void sumaPositivos() {
		System.out.println("Sumando dos numeros positivos...");
		Suma S=new Suma(2,3);
		assertTrue(S.sumar() == 5);
	}
// Comentario de Jesús Avilés Martínez
}
