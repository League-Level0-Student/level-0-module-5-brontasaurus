package _01_algorithms._2_fibonacci;

public class lies {

	public static void main(String[] args) {
		
		int o = 0;
		int h = 1;
		int e = o + h;
		System.out.println(o);
		System.out.println(h);
		for (int i = 0; i < 12; i++) {
			e=o+h;
			o=h;
			h=e;
			System.out.println(e);
			
		}
		
		
		
	}
	
	
}
