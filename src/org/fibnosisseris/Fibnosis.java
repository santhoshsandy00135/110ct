package org.fibnosisseris;

public class Fibnosis {
	public static void main(String[] args) {
		int t, f=0,
		s=1;
		for (int i = 0; i <=8; i++) {
			System.out.println(f);
			t=f+s;
					f=s;
					s=t;
					
			
			
		}
		
	}

}
