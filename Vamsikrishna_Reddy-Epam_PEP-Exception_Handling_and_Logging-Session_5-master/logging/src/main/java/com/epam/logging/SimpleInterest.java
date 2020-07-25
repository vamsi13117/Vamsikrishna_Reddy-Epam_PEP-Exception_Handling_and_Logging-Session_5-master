package com.epam.logging;

public class SimpleInterest {
	double principle;
	double time;
	double rate;
	
	public SimpleInterest(double principle, double time, double rate) {
		this.principle = principle;
		this.time = time;
		this.rate = rate;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getSimpleInterest() {
		return (principle*time*rate)/100;
	}
}

