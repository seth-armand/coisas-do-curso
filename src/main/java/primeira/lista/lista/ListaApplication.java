package primeira.lista.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);

		Scanner S = new scanner(System.in);
		System.out.println("escreva o primeiro numeor ");
		double numero1 = S.nextdouble(System.in);
		System.out.println("escreva o segundo numero ");
		double numero2 = S.nextdouble(System.in);
		S.close();
		double soma = numero1 + numero2;
		System.out.println("a soma de" + numero1 + "e" + numero2 + "igua a " + soma);


	}

}
