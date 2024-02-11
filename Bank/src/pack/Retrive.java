package pack;

import java.util.Iterator;
import java.util.List;

public class Retrive {

	public static void main(String[] args) {

		BuildMerch bm = new BuildMerch();

		List<Merchent> lmerch = bm.build();

		for (Merchent mbr : lmerch) {
			
			System.out.println(mbr.getId());
			System.out.println(mbr.getName());

			Bank br = mbr.getBank();
//			System.out.println(lmerch);
			System.out.println(br.getId());
			System.out.println(br.getName());
//			System.out.println(br);
			
			System.out.println("----------------------------------");
		}
//		System.out.println(lmerch);
		
	}
}
