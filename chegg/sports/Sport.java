public class Sport{
    public String sportName;
    public int noOfPlayers;
    public Sport(String name, int pl){
        sportName = name;
        noOfPlayers = pl;
    }
    public void displayMessage(){
        System.out.println("Sport name is " + sportName);
        System.out.println("Number of players who play this sport " +  noOfPlayers); 
    }
}