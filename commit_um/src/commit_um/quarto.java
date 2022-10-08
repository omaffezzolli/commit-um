package commit_um;

public class quarto {
	public static void main(String[] args) 
    {
        String[] array = {"jlm", "abd", "jude", "jlm", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i <array.length-1; i++)
        {
            for (int a = i+1; a < array.length; a++)
            {
                if( (array[i].equals(array[a])) && (i != a) )
                {
                    System.out.println("Duplicate Element is : "+array[a]);
                }
            }
        }
    }    

}
