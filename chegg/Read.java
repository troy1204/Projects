import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read{
	public static void main(String args[]){
        FileInputStream fis = null;
        StringBuilder dwarves = new StringBuilder(); 
        StringBuilder wizards = new StringBuilder(); 
        int dtot = 0;
        int wtot = 0;

        try{
        	fis = new FileInputStream("list.txt");
        	Scanner scan = new Scanner(fis);
        	String line;
        	while(scan.hasNextLine()){
        		line = scan.nextLine();
        		String[] buf = line.split(" ");
        		if(buf[0].equals("Dwarf")){
        			dwarves.append(buf[1]).append(", ");
        			dtot += Integer.parseInt(buf[2]);
        		}
        		if(buf[0].equals("Wizard")){
        			wizards.append(buf[1]).append(", ");
        			wtot += Integer.parseInt(buf[2]);
        		}
        	}
        	scan.close();

        }
        catch(FileNotFoundException ex){
        	System.out.println("File not found!");
        }
        catch(IOException ex){
        	System.out.println("Error occurred");
        }
        System.out.println("The invited dwarves : ");
        System.out.println(dwarves);
       	System.out.println("The invited wizards : ");
       	System.out.println(wizards);
       	System.out.println("The total that dwarves will bring : " + dtot);
       	System.out.println("The total that wizards will bring : " + wtot);
	}
}