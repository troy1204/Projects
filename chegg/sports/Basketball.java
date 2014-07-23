public class Basketball extends Sport{
    public String device;

    public Basketball(String name, int pl, String dev){
        super(name, pl);
        this.device = dev;
    }
    public void displayMessage(){
        System.out.println("Sport name is " + sportName);
        System.out.println("Number of players who play this sport " +  noOfPlayers);
        System.out.println("Basketball is played with a " + device);
        System.out.println("Basketball players are very tall");
        System.out.println("--------------------------------------");
    }
}