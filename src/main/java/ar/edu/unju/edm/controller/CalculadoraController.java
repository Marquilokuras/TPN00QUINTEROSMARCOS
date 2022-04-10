package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {

	@GetMapping("/menu")
	public String mostrarMenuCalculadora() {
		
		return "index";
	}
	
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		int resultadoS = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverSuma();
		resultadoS = nuevaCalculadora.ResolverSuma();
		model.addAttribute("resultadoS", resultadoS);
		return "resultadoS";
	}
	
	@GetMapping("/calculoResta")
	public String getRestaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		int resultadoR = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverResta();
		resultadoR = nuevaCalculadora.ResolverResta();
		model.addAttribute("resultadoR", resultadoR);
		return "resultadoR";
	}

	@GetMapping("/calculoMulti")
	public String getMultiPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		int resultadoM = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverMulti();
		resultadoM = nuevaCalculadora.ResolverMulti();
		model.addAttribute("resultadoM", resultadoM);
		return "resultadoM";
	}
	
	@GetMapping("/calculoDivision")
	public String getDivisionPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		int resultadoD = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverDivision();
		resultadoD = nuevaCalculadora.ResolverDivision();
		model.addAttribute("resultadoD", resultadoD);
		return "resultadoD";
	}
	
	@GetMapping("/calculoSPotencia")
	public String getPotenciaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		int resultadoP = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverPotencia();
		resultadoP = nuevaCalculadora.ResolverPotencia();
		model.addAttribute("resultadoP", resultadoP);
		return "resultadoP";
	}
	
	@GetMapping("/calculoRaiz")
	public String getRaizPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2, Model model) {
		float resultadoRA = 0;
		Calculadora nuevaCalculadora = new Calculadora();
		nuevaCalculadora.setNumero1(num1);
		nuevaCalculadora.setNumero2(num2);
		nuevaCalculadora.ResolverRaiz();
		resultadoRA = nuevaCalculadora.ResolverRaiz();
		model.addAttribute("resultadoRA", resultadoRA);
		return "resultadoRA";
	}
	

}
