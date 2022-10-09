package commit_um;

public class quinto {
	
	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] array = {
	            1978, 2503, 1989, 1546, 2031, 
	            1584, 2548, 4125, 2147, 3625, 
	            1546, 2625, 7145, 2645};
	      System.out.println(contains(array, 2031));
	      System.out.println(contains(array, 2015));
	   }

}
