import java.util.ArrayList;

public class Inversor {

	public static void main(String[] args) {

	}

	public String inverte(String palavraInserida) {

		// É iniciado com vazio para não dar problema na concatenação
		String palavraInversa = "";

		// Itera sobre a palavraInserida de maneira que vai da última para a
		// primeira letra concatenando com o resultado
		for (int i = palavraInserida.length() - 1; i >= 0; i--) {

			// Faz a concatenação
			palavraInversa += palavraInserida.charAt(i);
		}

		// Retorna a palavra inversa;
		return palavraInversa;

	}

}
