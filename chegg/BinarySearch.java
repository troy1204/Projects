//Usage : java BinarySearch  tinyW.txt tinyT.txt
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class BinarySearch {

	public static int[] removeDuplicates(int[] input)
	{ 
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2)
        {
            return input;
        }
        while(i < input.length)
        {
            if(input[i] == input[j])
            {
                i++;
            }else
            {
                input[++j] = input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++)
        {
            output[k] = input[k];
        }     
        return output;
    }

   public static int rank(int key, int[] a) {
    	int lo = 0;
       	int hi = a.length - 1;
       	while (lo <= hi)
       	{
        	// Key is in a[lo..hi] or not present.
           	int mid = lo + (hi - lo) / 2;
           	if      (key < a[mid]) hi = mid - 1;
           	else if (key > a[mid]) lo = mid + 1;
           	else return mid;
       	}
       	return -1;
   	}

   	public static void main(String[] args) 
   	{
   		int[] whitelist = new int[18];
   		int[] keys = new int[20];
        
   		try
   		{
   			File fil = new File(args[0]);
			Scanner scanner = new Scanner(fil);
			int i = 0;
			while(scanner.hasNextInt())
			{ 
			    whitelist[i++] = scanner.nextInt(); //this is line 19
			}
   		}
   		catch(Exception ex){}

       	Arrays.sort(whitelist);
       	whitelist = removeDuplicates(whitelist);
       	
       	try
       	{
   			File fil2 = new File(args[1]);
			Scanner scanner2 = new Scanner(fil2);
			int j = 0;
			while(scanner2.hasNextInt())
			{
				keys[j++] = scanner2.nextInt();    
			}
   		}
   		catch(Exception exp){}

   		for (int r = 0; r < keys.length; r++) 
   		{
   			if(rank(keys[r], whitelist) == -1)
			    System.out.println(keys[r]);
		}
	}
} 
