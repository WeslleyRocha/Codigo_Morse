package com.example.codigo_morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/codigomorse")
public class CodigoMorse {

	String nCodigo;

	@GetMapping("/codigo/{nCodigo}")
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
	}

}

