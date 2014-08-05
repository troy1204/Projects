import java.awt.Color;
import java.awt.Container;
import java.awt.event.*; 
import javax.swing.*;

public class RockPaperScissorsGUI {
    static int humanWon; // use for statistic
    static int win=0;
    static int total=0;
    static int tie=0;

    enum Move {
        ROCK(0, "0.jpeg"), PAPER(1, "1.jpeg"), SCISSORS(2, "2.jpeg");
        private int num;
        private ImageIcon ic;
        private Move(int n, String f){
            this.num = n;
            this.ic = new ImageIcon(f);
        }   
    }

    public static void main(String[] args){ // main
        gamePanel();// launch main game        
    }

    private static void gamePanel(){ // the main game panel

        JFrame frame = new JFrame("Rock, Scissors, Paper");  //the main frame of the game 

        Container panel = frame.getContentPane();  // creating a container panel, so we can place buttons where we pleased
        panel.setLayout(null); 

        String[] iconString= new String[3]; // creating icon string name so we can place the directory in with little effort
        int[] boundInt= new int[3]; // same idea

        for(int i=0; i<=2; i++){ // creating the condtions
            iconString[i]=i+".jpeg";
            boundInt[i]=40+150*i;
        }

        JButton b1 = new JButton (" ", Move.ROCK.ic);
        b1.setBackground(Color.white);
        b1.setBounds(40,boundInt[0],150,150);


        JButton b2 = new JButton (" ", Move.PAPER.ic);
        b2.setBackground(Color.white);
        b2.setBounds(40,boundInt[1],150,150);

        JButton b3 = new JButton (" ", Move.SCISSORS.ic);
        b3.setBackground(Color.white);
        b3.setBounds(40,boundInt[2],150,150);//creating three buttons


        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
      

        b1.addActionListener( //next three button will listen for which play pick and calculate the win in computeWinner

                new ActionListener() {
                    public void actionPerformed( ActionEvent event ) {
                        computeWinner(1);
                    }
                }
        );

        b2.addActionListener(

                new ActionListener() {
                    public void actionPerformed( ActionEvent event ) {
                        computeWinner(2);
                    }
                }
        );

        b3.addActionListener(

                new ActionListener() {
                    public void actionPerformed( ActionEvent event ) {
                        computeWinner(3);
                    }
                }
        );

        frame.setSize(275, 600); 
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set frame size and the game begins!     
    }

    public static void computeWinner(int x){ // computing the winner
        int computerChoice=computerRandomChoice();
        int humanChoice=x;
        String text,text1="";
        String winningCombination= ""+Math.min(computerChoice, humanChoice)+Math.max(computerChoice, humanChoice);

        switch(Integer.parseInt(winningCombination)){

        case 12:
            text = "Paper wins!";
            if(humanChoice==2) humanWon=1;
            break;
        case 13:
            text = "Rock wins!";
            if(humanChoice==1) humanWon=1;
            break;
        case 23:
            text = "Scissors wins!";
            if(humanChoice==3) humanWon=1;
            break;
        default: text="It is a tie!";
        humanWon=2;
        tie=tie+1;
        }
        if(humanWon==1){
            text1="You win! ";
            humanWon=0;
            win=win+1;
            total=total+1;
        }else if(humanWon==2){
            text1="It is a tie! ";
            humanWon=0;     
        }else{
            text1="Computer wins! ";
            total=total+1;
        }

        JFrame frame = new JFrame("Rock, Scissors, Paper"); 
        Container panel = frame.getContentPane(); 
        panel.setLayout(null); 

        JLabel l0 = new JLabel(text1+text);
        l0.setBounds(75, 10, 300, 35);
        panel.add(l0);

        //show the result in a new splash screen
        JLabel l1 = new JLabel("Your Choice");
        l1.setBounds(40, 35, 150, 35);
        panel.add(l1);

        JLabel l2 = new JLabel("Computer's Choice");
        l2.setBounds(215, 35, 150, 35);
        panel.add(l2);

        JLabel l3 = new JLabel(new ImageIcon((humanChoice-1)+".jpeg"));
        l3.setBounds(10, 70, 150, 150);
        panel.add(l3);

        JLabel l4 = new JLabel(new ImageIcon((computerChoice-1)+".jpeg"));
        l4.setBounds(200, 70,150, 150);
        panel.add(l4);

        frame.setSize(400, 270); 
        frame.setVisible(true);         
    }

    public static int computerRandomChoice(){// creating a random choice of rock paper or scissors by the computer
        int result=(int)(Math.random()*3)+1;        
        return result;
    }

}
