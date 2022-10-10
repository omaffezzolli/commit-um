package commit_um;

public class sexto {
	
	public static void main(String[] args) 
    {
        int[] array = {1, 2, 7, 7, 6, 6, 8, 1};
 
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Elemento duplicado : "+array[j]);
                }
            }
        }
    }    

}
