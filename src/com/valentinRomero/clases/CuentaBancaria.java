package com.valentinRomero.clases;
import java.util.ArrayList;
import java.math.*;
public class CuentaBancaria {
	private double saldo;
	private Persona titular;
	private int numeroCuenta;
	
	public static ArrayList<CuentaBancaria> listaDeCuentas = new ArrayList<>();
	
	public CuentaBancaria(double saldo, Persona titular) {
		this.numeroCuenta = (int)(Math.random() * 900000) + 100000;
		this.saldo = saldo;
		this.titular = titular;
		listaDeCuentas.add(this);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static ArrayList<CuentaBancaria> getListaDeCuentas() {
		return listaDeCuentas;
	}

	public static void setListaDeCuentas(ArrayList<CuentaBancaria> listaDeCuentas) {
		CuentaBancaria.listaDeCuentas = listaDeCuentas;
	}
	
	public void depositar (double monto) {
		this.setSaldo(getSaldo()+monto);
	}
	
	public void retirar (double monto) {
		if (this.getSaldo()>monto) {
			this.setSaldo(getSaldo()-monto);
		}
	}
	
	public void despliegaInformacion() {		
		System.out.println("Información de la cuenta: ");
		System.out.println("Número de cuenta: "+this.numeroCuenta);		
		System.out.println("Titular: ");
		this.titular.despliegaInformacion();
		System.out.println("Saldo: "+this.saldo);
	}
	
	public static void imprimeInformacionDeTodasLasCuentas() {
		System.out.println("Información de las cuentas: ");
		for (CuentaBancaria cuenta : listaDeCuentas) {
			cuenta.despliegaInformacion();
		}
	}
}
