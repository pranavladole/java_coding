package coding;

public class ReverseString {

	public static void main(String[] args) {
		String name = "pranav";
		System.out.println("StringBuffer " + new String(new StringBuffer(name).reverse().toString()));

		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("using for " + rev);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=name.length()-1;i>=0;i--) {
			sb.append(name.charAt(i));
		}
		System.out.println("Stringbuilder "+sb.toString());
	
		name.chars().sorted().forEach(c->System.out.print((char)c));
		
		
		
	}

}
