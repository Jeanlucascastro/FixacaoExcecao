package model.entities;

import model.exeptions.MinhaExeption;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double limiteSaque;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double limiteSaque) {
	
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	
	//Metodos
	
	
	public void deposito (Double valorDeposito) {
		balance += valorDeposito;
	}
	
	public void saque (Double valorSaque) {
		if (valorSaque >= balance) {
		throw new MinhaExeption ("Saque indisponivel por falta de saldo ");
	}
	
	if (valorSaque >= limiteSaque) {
		throw new MinhaExeption ("Limite indisponivel ");
		
	}
		balance -= valorSaque;
		
	}
	
	
	
}
