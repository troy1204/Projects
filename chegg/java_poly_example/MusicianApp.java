import inheritancePolymorphism.*;
public class MusicianApp {
	public static void main(String[] args) {
		TrumpetPlayer t = new TrumpetPlayer("Louis Armstrong");
		GuitarPlayer g = new GuitarPlayer("Jimi Hendrix");
		Musician[] m = new Musician[2];
		m[0] = t;
		m[1] = g;
		for(int i = 0; i < m.length; i++){
			m[i].practise();
			m[i].perform();
			if(m[i] instanceof GuitarPlayer){
				((GuitarPlayer)m[i]).restring();
			}
			System.out.println(m[i]);
		}
		m[0].perform();
		System.out.println(m[0]);
	}
}