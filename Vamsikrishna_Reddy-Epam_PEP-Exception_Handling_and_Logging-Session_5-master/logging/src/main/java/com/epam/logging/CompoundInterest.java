package com.epam.logging;


public class CompoundInterest {
	double principle;
	double time;
	double rate;
	double interestPerTime;
	
	public CompoundInterest(double principle, double time, double rate, double interestPerTime) {
		this.principle = principle;
		this.time = time;
		this.rate = rate;
		this.interestPerTime = interestPerTime;
	}
	
	public double getInterestPerTime() {
		return interestPerTime;
	}

	public void setInterestPerTime(double interestPerTime) {
		this.interestPerTime = interestPerTime;
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

	public double getCompoundInterest() {
		return principle*Math.pow((1+rate/interestPerTime),time);
	}
}
