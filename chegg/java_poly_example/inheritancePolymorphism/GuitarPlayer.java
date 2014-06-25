package inheritancePolymorphism;
public class GuitarPlayer extends Musician {
	public GuitarPlayer(String n){
		super(n);
	}
	
	public void practise(){
   		System.out.println("practising to pluck the guitar");
    }

	public void restring(){
		System.out.println("restringing");
	}	
}