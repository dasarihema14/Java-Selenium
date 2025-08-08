package wipro;

public class StringBuffer {
	public static void main(String[] args) {
		
		String s= " hello " ;
		String p="world";
		System.out.println(s.length());
		System.out.println(s.concat(p));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.split(s));
		System.out.println(s.replace('e','l'));
		System.out.println(s.indexOf('l', 3));
		System.out.println(s+ "" + p);
		
		
		String str="we are trainees of \"Techademy\"";
		System.out.println(str);
		String a="I\'m Hema\nI\'m 21 years old";
		System.out.println(a);
		String st="I\'m Hema\t I\'m 21 years old";
		System.out.println(st);
	}

}
