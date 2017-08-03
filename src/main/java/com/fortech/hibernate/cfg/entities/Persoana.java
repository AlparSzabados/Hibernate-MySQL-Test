package com.fortech.hibernate.cfg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "persoana")
public class Persoana {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cnp;

	@Column(name="Nume")
	private String Nume;
	
	@Column(name="Prenume")
	private String Prenume;
	
	@Column(name="Varsta")
	private int Varsta;
	
	@Column(name="Data_nastere")
	private String Data_nastere;
	
	@Column(name="cnp_parinte")
	private int cnp_parinte;

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		Nume = nume;
	}

	public String getPrenume() {
		return Prenume;
	}

	public void setPrenume(String prenume) {
		Prenume = prenume;
	}

	public int getVarsta() {
		return Varsta;
	}

	public void setVarsta(int varsta) {
		Varsta = varsta;
	}

	public String getData_nastere() {
		return Data_nastere;
	}

	public void setData_nastere(String data_nastere) {
		Data_nastere = data_nastere;
	}

	@Override
	public String toString() {
		return "Persoana [Cnp=" + Cnp + ", Nume=" + Nume + ", Prenume=" + Prenume + ", Varsta=" + Varsta
				+ ", Data_nastere=" + Data_nastere + ", cnp_parinte=" + cnp_parinte + "]";
	}

	public int getCnp() {
		return Cnp;
	}

	public void setCnp(int cnp) {
		Cnp = cnp;
	}

	public int getCnp_parinte() {
		return cnp_parinte;
	}

	public void setCnp_parinte(int cnp_parinte) {
		this.cnp_parinte = cnp_parinte;
	}




}
