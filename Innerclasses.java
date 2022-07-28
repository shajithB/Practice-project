package practice;
public class Innerclasses {

private String a="Good morning! Have a nice day :)";

 void display(){  
	 class s{  
		 void a(){
			 System.out.println(a);
		 }  
  }  
	 s l=new s();  
	  l.a();  
	 }  

	 
	public static void main(String[] args) {
		Innerclasses  ob=new Innerclasses ();  
		ob.display();  
		}
	}