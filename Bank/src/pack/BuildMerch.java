package pack;

import java.util.ArrayList;
import java.util.List;

public class BuildMerch {

	public List<Merchent> build() {

		List<Merchent> listMerchnt = new ArrayList<>();

		Bank b = new Bank(9, "Maha");
		Merchent m1 = new Merchent(10, "Info", new Bank(2, "ICICI"));
		Merchent m2 = new Merchent(20, "TCS", new Bank(8, "SBI"));
		listMerchnt.add(m1);
		listMerchnt.add(m2);

		return listMerchnt;

	}

//	public static void main(String[] args) {
//		
//		Merchent m1 = new Merchent(10, "Info", new Bank(2, "ICICI"));
//		Merchent m2 = new Merchent(20, "TCS", new Bank(8, "SBI"));
//	
//		
//		System.out.println(m1.getId());
//		System.out.println(m1.getName());
////		Bank b=m1.getBank();
//		System.out.println(m2.getBank().getId());
//		System.out.println(m2.getBank().getName());
//	
//	
//	}
}
