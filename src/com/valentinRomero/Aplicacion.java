package com.valentinRomero;

import com.valentinRomero.clases.*;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona P1 = new Persona ("Valentin",24);
		Persona P2 = new Persona ("Victoria", 23);
		Persona P3 = new Persona ("Julian",21);
		
		CuentaBancaria C1 = new CuentaBancaria(2352.2,P1);
		C1.despliegaInformacion();
		CuentaBancaria C2 = new CuentaBancaria(456.6,P2);
		C2.despliegaInformacion();
		CuentaBancaria C3 = new CuentaBancaria(92875.5,P3);
		C2.despliegaInformacion();
		System.out.println("------------------------------------\n");
		C1.depositar(2000.0);
		C1.despliegaInformacion();
		System.out.println("------------------------------------\n");
		C2.depositar(1000.0);
		C2.despliegaInformacion();
		System.out.println("------------------------------------\n");
		C1.retirar(1000.0);
		C1.despliegaInformacion();
		System.out.println("------------------------------------\n");
		C3.retirar(2875.5);
		C3.despliegaInformacion();
		System.out.println("------------------------------------\n");
		CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
		System.out.println("------------------------------------\n");
	}

}
