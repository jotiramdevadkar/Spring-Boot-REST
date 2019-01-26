package com.jotiram.foodstall.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="snacks")
public class Snack {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="snacks_id")
	private int snacksId;
	
	@Column(name="pasta")
	private String pasta;
	
	@Column(name="poha")
	private String Poha;

	public int getSnacksId() {
		return snacksId;
	}

	public void setSnacksId(int snacksId) {
		this.snacksId = snacksId;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public String getPoha() {
		return Poha;
	}

	public void setPoha(String poha) {
		Poha = poha;
	}

	public Snack() {
		super();
	}

	public Snack(int snacksId, String pasta, String poha) {
		super();
		this.snacksId = snacksId;
		this.pasta = pasta;
		Poha = poha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Poha == null) ? 0 : Poha.hashCode());
		result = prime * result + ((pasta == null) ? 0 : pasta.hashCode());
		result = prime * result + snacksId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snack other = (Snack) obj;
		if (Poha == null) {
			if (other.Poha != null)
				return false;
		} else if (!Poha.equals(other.Poha))
			return false;
		if (pasta == null) {
			if (other.pasta != null)
				return false;
		} else if (!pasta.equals(other.pasta))
			return false;
		if (snacksId != other.snacksId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Snack [snacksId=" + snacksId + ", pasta=" + pasta + ", Poha=" + Poha + "]";
	}
	
	
}
