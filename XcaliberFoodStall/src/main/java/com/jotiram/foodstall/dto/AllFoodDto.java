package com.jotiram.foodstall.dto;

public class AllFoodDto {

	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String dateOfBirth;
	
	private String cheesepizza;
	private String vegPizza;
	
	private String pasta;
	private String poha;
	
	private String coke;
	private String sprite;
	
	public AllFoodDto() {
		super();
	}

	public AllFoodDto(String firstName, String lastName, String email, String gender, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public AllFoodDto(String cheesepizza, String vegPizza) {
		super();
		this.cheesepizza = cheesepizza;
		this.vegPizza = vegPizza;
	}

	public AllFoodDto(String firstName, String lastName, String email, String gender, String dateOfBirth,
			String cheesepizza, String vegPizza, String pasta, String poha, String coke, String sprite) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.cheesepizza = cheesepizza;
		this.vegPizza = vegPizza;
		this.pasta = pasta;
		this.poha = poha;
		this.coke = coke;
		this.sprite = sprite;
	}

	@Override
	public String toString() {
		return "AllFoodDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", cheesepizza=" + cheesepizza + ", vegPizza=" + vegPizza
				+ ", pasta=" + pasta + ", poha=" + poha + ", coke=" + coke + ", sprite=" + sprite + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCheesepizza() {
		return cheesepizza;
	}

	public void setCheesepizza(String cheesepizza) {
		this.cheesepizza = cheesepizza;
	}

	public String getVegPizza() {
		return vegPizza;
	}

	public void setVegPizza(String vegPizza) {
		this.vegPizza = vegPizza;
	}

	public String getPasta() {
		return pasta;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public String getPoha() {
		return poha;
	}

	public void setPoha(String poha) {
		this.poha = poha;
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
		result = prime * result + ((cheesepizza == null) ? 0 : cheesepizza.hashCode());
		result = prime * result + ((coke == null) ? 0 : coke.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((pasta == null) ? 0 : pasta.hashCode());
		result = prime * result + ((poha == null) ? 0 : poha.hashCode());
		result = prime * result + ((sprite == null) ? 0 : sprite.hashCode());
		result = prime * result + ((vegPizza == null) ? 0 : vegPizza.hashCode());
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
		AllFoodDto other = (AllFoodDto) obj;
		if (cheesepizza == null) {
			if (other.cheesepizza != null)
				return false;
		} else if (!cheesepizza.equals(other.cheesepizza))
			return false;
		if (coke == null) {
			if (other.coke != null)
				return false;
		} else if (!coke.equals(other.coke))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (pasta == null) {
			if (other.pasta != null)
				return false;
		} else if (!pasta.equals(other.pasta))
			return false;
		if (poha == null) {
			if (other.poha != null)
				return false;
		} else if (!poha.equals(other.poha))
			return false;
		if (sprite == null) {
			if (other.sprite != null)
				return false;
		} else if (!sprite.equals(other.sprite))
			return false;
		if (vegPizza == null) {
			if (other.vegPizza != null)
				return false;
		} else if (!vegPizza.equals(other.vegPizza))
			return false;
		return true;
	}
	
	
	
}
