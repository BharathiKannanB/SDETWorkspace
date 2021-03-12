package week12.problems;

public class Test {



		   public static void main(String[] args){

		      String str ="apple";
		      String str2 = "apple";
		      String str3 = new String("apple");
		      System.out.println(str.equals(str2));
		      System.out.println(str==str2);
		      System.out.println(str.equals(str3));
		      System.out.println(str==str3);
		      System.out.println(str.hashCode());
		      str="orange";
		      System.out.println(str.hashCode());
		      System.out.println(str2.hashCode());
		      System.out.println(str3.hashCode());

		      
		   }
}
