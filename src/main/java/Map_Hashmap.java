

import java.util.HashMap;

public class Map_Hashmap {

	public static void main(String[] args) {
		HashMap dr=new HashMap();
		dr.put("shan", 534);
		dr.put("mitra", 435);
		dr.put("yeu", 876);
		dr.put("tre", 974);
		dr.put(null, 321);
		System.out.println(dr.entrySet());
		System.out.println(dr.values());
		System.out.println(dr.keySet());
		dr.put(null,null);
		System.out.println(dr);
		System.out.println(dr.remove("shan", 534));
		

	}

}
