package pack;

public class Bank {
	private int id;
	private String Name;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int id, String name) {
		super();
		this.id = id;
		Name = name;
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
//	@Override
//	public String toString() {
//		return "Bank [id=" + id + ", Name=" + Name + "]";
//	}

}