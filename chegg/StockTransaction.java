import java.io.Console;
public class StockTransaction{
	String stock_symbol;
	String stock_name;
	int price_per_share;
	
	private String getStock_symbol(){
		return stock_symbol;
	}

	private void setStock_symbol(String x){
		this.stock_symbol = x;
	}

	private String getStock_name(){
		return stock_name;
	}

	private void setStock_name(String y){
		this.stock_name = y;
	}

	private int getPrice_per_share(){ 
		return price_per_share; 
	}

	private void setPrice_per_share(int z){ 
		this.price_per_share = z; 
	}
	

	public static void main(String[] args) {
		StockTransaction[] stArray = new StockTransaction[10]; 
		Console console = System.console();
		for(int i=0; i<10; i++){
			StockTransaction st = new StockTransaction();
			System.out.println("Enter Stock Symbol"); 
			st.setStock_symbol(console.readLine());

			System.out.println("Enter Stock Name"); 
			st.setStock_name(console.readLine());

			System.out.println("Enter price per share"); 
			st.setPrice_per_share(Integer.parseInt(console.readLine()));
			
			stArray[i] = st;

		}

		for(int j=0; j<10; j++){
			System.out.println("Stock Symbol "+ j + " = " + stArray[j].getStock_symbol());
			System.out.println("Stock Name "+ j + " = " + stArray[j].getStock_name());
			System.out.println("Price per share "+ j + " = " + stArray[j].getPrice_per_share());
		}
	}		
}
