package com.jotiram.foodstall.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drinks")
public class Drink {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="drinks_id")
	private int drinksId;
	
	@Column(name="coke")
	private String coke;
	
	@Column(name="sprite")
	private String sprite;

	public Drink() {
		super();
	}

	public Drink(int drinksId, String coke, String sprite) {
		super();
		this.drinksId = drinksId;
		this.coke = coke;
		this.sprite = sprite;
	}

	public int getDrinksId() {
		return drinksId;
	}

	public void setDrinksId(int drinksId) {
		this.drinksId = drinksId;
	}

	public String getCoke() {
		return coke;
	}

	public void setCoke(String coke) {
		this.coke = coke;
	}

	public String getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coke == null) ? 0 : coke.hashCode());
		result = prime * result + drinksId;
		result = prime * result + ((sprite == null) ? 0 : sprite.hashCode());
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
		Drink other = (Drink) obj;
		if (coke == null) {
			if (other.coke != null)
				return false;
		} else if (!coke.equals(other.coke))
			return false;
		if (drinksId != other.drinksId)
			return false;
		if (sprite == null) {
			if (other.sprite != null)
				return false;
		} else if (!sprite.equals(other.sprite))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drink [drinksId=" + drinksId + ", coke=" + coke + ", sprite=" + sprite + "]";
	}
	
	
}
