package inheritancePolymorphism;
public class Musician {
	public String name;
    public int performanceCount;
    public Musician(String n){
    	name = n;
    }
    public void perform(){
    	performanceCount++;
    	System.out.println("...performing"); 	
    }
    public void practise(){
    }
    public String toString(){
    	return "Musician type:" + this.getClass().getSimpleName() + ", Musician name:" + name + ", Number of performances:" + performanceCount;
    }
}