import java.util.Scanner;

//This program will take users input and add a percent amount then reprint
//users input in a table format.
public class InventoryTracker
{
    static String name[];
    static Double cost[];
public static void main(String[] args)
{
    //Intoruces Software To User
    greetMessage();
    Scanner ss1=new Scanner(System.in);
    Scanner ss2=new Scanner(System.in);
    Scanner ss3=new Scanner(System.in);
    name=new String[10];
    cost=new Double[10];
    System.out.println("Enter B to begin, E to end:(Enter uppercase only)");
    String result =ss1.nextLine();
    //Checks the input.
    if (result.equals("B"))
    {
        for(int i=0;i<10;i++)
    {
    inputName(i);
    name[i]=ss2.nextLine();
    inputCost();
    cost[i]=ss3.nextDouble();
    }
        }
    else //Exits from software if incorrect.
    {
    thankYou();
    System.exit(0);}
    displayOutput();
    thankYou();
}
public static void greetMessage()
{   //Informs user how to use software correctly.
    System.out.println("\t\tWelcome to the Inventory Tracker Program");
    System.out.println("This program will accept the names and costs for "
        + "10 stocked items." );
    System.out.println("The program will then output a table with the "
        + "names, costs, and prices of the items.");
    System.out.println("Prices are calculated with a 30% markup on cost.");
}
public static void thankYou()
{   //Thanks the user.
    System.out.println("\tThank you for using the Inventory Tracker "
        + "Program. Goodbye.");
}
public static void inputName(int i)
{   //Prompts for user name.
    System.out.print("Enter product " + (i+1) +" name : ");
}
public static void inputCost()
{   //Prompts user for cost.
    System.out.print("Enter the item cost : $");
}

public static void displayOutput()
{   //Code to display as table.
    double total = 0;
    System.out.println("\tInventory Table");
    System.out.println("Item Name\tItem Cost\tItem Price");
    for(int j=0;j<10;j++)
    {   //Adds cost to product
        System.out.println(name[j]+"\t\t$"+Math.round(cost[j]*100.0)/100.0+"\t\t$"+Math.round(1.3*cost[j]*100.0)/100.0);
        total = total + cost[j];
    }
    System.out.println();
    System.out.println("Total Cost of Goods is : $"+ Math.round(total*100.0)/100.0);
}
}
