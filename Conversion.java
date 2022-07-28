package practice;
public class Conversion {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String a=new String("Good morning");
		System.out.println(a.length());

		//substring
		String sub=new String("good");
		System.out.println(sub.substring(2));

		//String Comparison
		String b="word";
		String c="work";
		System.out.println(b.compareTo(c));

		//IsEmpty
		String d="";
		System.out.println(d.isEmpty());

		//toLowerCase
		String f="RAMU IS A good boy";
		System.out.println(f.toLowerCase());
		System.out.println(f.toUpperCase());
		
		//replace
		String g="replace";
		String replace=c.replace('l', 'e');
		System.out.println(replace);

		//equals
		String x="To the world";
		String y="To the world";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer h=new StringBuffer("Welcome to coding world");
		h.append("Enjoy");
		System.out.println(h);

		//insert method
		h.insert(0, 'w');
		System.out.println(h);

		//replace method
		StringBuffer cc=new StringBuffer("Hello");
		cc.replace(0, 2, "hEl");
		System.out.println(cc);

		//delete method
		cc.delete(0, 1);
		System.out.println(cc);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder bb=new StringBuilder("Happy");
		bb.append("Learning");
		System.out.println(bb);

		System.out.println(bb.delete(0, 1));

		System.out.println(bb.insert(1, "Welcome"));

		System.out.println(bb.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer n = new StringBuffer(str); 
        n.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(n); 
          
        // conversion from String object to StringBuilder 
        StringBuilder m = new StringBuilder(str); 
        m.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(m);              		
	}
}