package pack;

import java.util.List;

public class Merchent {

	private int id;
	private String Name;
	private Bank bank;
	public Merchent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Merchent(int id, String name,Bank bank) {
		super();
		this.id = id;
		Name = name;
		this.bank = bank;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	@Override
	public String toString() {
		return "Merchent [id=" + id + ", Name=" + Name + "]\n";
	}

}
