package in.co.rays;

public class Lang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String name = "Vijay Dinanath Chouhan";
		  System.out.println("String Length-"+name.length());
		  System.out.println("7 th character is - "+name.charAt(7));
		  System.out.println("dina index is " +name.indexOf("dina"));
		  System.out.println("first position - "+name.indexOf("i"));
		  System.out.println("Last position "+name.lastIndexOf("i"));
		  System.out.println("a is replaced by b - " +name.replace("a","b"));
		  System.out.println("all a is replaced by b - "+name.replaceAll("a","b" ));
		  System.out.println("chhota vijay - "+name.toLowerCase());
		  
		  
		  for(int i = name.length();i>0;i--) { System.out.print(name.charAt(i-1)); }
		  for(int i = name.lastIndexOf(" "); i<name.length();i++) {
		  
		  System.out.print(name.charAt(i));
		  
		  }
		 
		String arr[]=name.split(" ");
		for (int i=0;i<arr.length;i++) {
			for (int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
				System.out.print(" ");
			}
		}
			
		
		
		
	
		
		

	}

}
