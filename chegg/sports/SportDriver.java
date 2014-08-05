public class SportDriver{
    public static void main(String []args){
        Sport s1, s2, s3, s4;
        s1 = new Football("Football", 11);
        s2 = new Tennis("Tennis",2, "racquet");
        s3 = new Basketball("Basketball", 5, "basket-ball");
        s4 = new Baseball("Baseball", 9, "baseball bat");
        s1.displayMessage();
        s2.displayMessage();
        s3.displayMessage();
        s4.displayMessage();
    }
}
