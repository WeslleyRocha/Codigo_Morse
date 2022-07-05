package com.example.codigo_morse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/codigo_morse")
public class CodigoMorse {

	String nCodigo;

	private Map<String, String> dicionarioMorse = new HashMap<> () {{

		//Dicionario Morse, que vai ser consumido pelo Map.
		put(".-", "A");
		put("-...", "B");
		put("-.-.", "C");
		put("-..", "D");
		put(".", "E");
		put("..-.", "F");
		put("--.", "G");
		put("....", "H");
		put("..", "I");
		put(".---", "J");
		put("-.-", "K");
		put(".-..", "L");
		put("--", "M");
		put("-.", "N");
		put("---", "O");
		put(".--.", "P");
		put("--.-", "Q");
		put(".-.", "R");
		put("...", "S");
		put("-", "T");
		put("..-", "U");
		put("...-", "V");
		put(".--", "W");
		put("-..-", "X");
		put("-.--", "Y");
		put("--..", "Z");

		put(".----", "1");
		put("..---", "2");
		put("...--", "3");
		put("....-", "4");
		put(".....", "5");
		put("-....", "6");
		put("--...", "7");
		put("---..", "8");
		put("----.", "9");
		put("-----", "0");

		put("..--..", "?");
		put("-.-.--", "!");
		put(".-.-.-", ".");
		put("--..--", ",");
		put("_", "_");

	}};

	@GetMapping("/codigo/{nCodigo}")
	public ResponseEntity<String>  converter (@PathVariable String nCodigo){

		String texto = "";

		// Separa os espaços "   " do texto em palavras.
		for (String palavra : nCodigo.split("   ")) {

			//Separar as palavras em letras utilizando o " " como metodo de separar.
			for(String letras : palavra.split(" ")){

				texto += dicionarioMorse.get(letras);
			}
		}
		return ResponseEntity.ok(texto);
	}

// Codigo Antigo, V.0.0.1
/*	@GetMapping("/codigo/{nCodigo}")
	public String converterCodigo (@PathVariable String nCodigo){

		switch (nCodigo) {
			case ("--- .-.. .-"):
				return "OLÁ";
			case ("-- . .-. -.-. .- -.. --- .-.. .. ...- .-. ."):
				return "MERCADO LIVRE";
			case ("... .--. .-. .. -. --."):
				return "SPRING";
		}
		return null;
	}*/
}

