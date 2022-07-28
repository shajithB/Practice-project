package practice;
class Main {
	  private String name;
	  Main() {
	    System.out.println("Constructor Called:");
	    name = "Simplilearn";
	   
	  }
	  public static void main(String[] args) {
	    Main object = new Main();
	    System.out.println("The name is " + object.name);
	    
	  }
	}
