

public class even_index_and_odd_index_word_String {

	public static void main(String[] args) {
	   String num="THis is the first String in java class";
	  String[] m = num.split(" ");
	  System.out.println("****even index*****");
	   for(int i=0;i<=m.length-1;i=i+2){
		   System.out.println(m[i]);
	   }
	   System.out.println("****odd intex*****");
	   for(int i=1;i<=m.length-1;i=i+2) {
		   System.out.println(m[i]);
	   }

	}

}
