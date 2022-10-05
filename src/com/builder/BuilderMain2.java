package com.builder;

class User {
	private final String nume;
	private final String prenume;
	private final int varsta;
	private final int greutate;
	private final String gen;

	public User(UserBuilder userBuilder) {
		this.nume = userBuilder.nume;
		this.prenume = userBuilder.prenume;
		this.varsta = userBuilder.varsta;
		this.greutate = userBuilder.greutate;
		this.gen = userBuilder.gen;
	}

	@Override
	public String toString() {
		return "User [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", greutate=" + greutate
				+ ", gen=" + gen + "]";
	}

	public static class UserBuilder {
		private String nume;
		private String prenume;
		private int varsta;
		private int greutate;
		private String gen;

		public UserBuilder(String nume, String prenume) {
			this.nume = nume;
			this.prenume = prenume;
		}

		public UserBuilder withVarsta(int varsta) {
			this.varsta = varsta;
			return this;
		}

		public UserBuilder withGreutate(int greutate) {
			this.greutate = greutate;
			return this;
		}

		public UserBuilder withGen(String gen) {
			this.gen = gen;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

}

public class BuilderMain2 {

	public static void main(String[] args) {
		User user = new User.UserBuilder("pacurariu", "marco").withGreutate(75).withGen("M").build();
		System.out.println(user);
	}

}
