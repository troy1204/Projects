public class MyStack {
   private int maxSize;
   private int[] stackArray;
   private int top;

   public MyStack(int s) {
      maxSize = s;
      stackArray = new int[maxSize];
      top = -1;
   }
   public void push(int j) {
      stackArray[++top] = j;
   }

   public int pop() {
      return stackArray[top--];
   }

   public int peek() {
      return stackArray[top];
   }

   public boolean isEmpty() {
      return (top == -1);
   }

   public boolean isFull() {
      return (top == maxSize - 1);
   }

   public static void main(String[] args) {
      MyStack theStack = new MyStack(30); 
      int counter = 0;
      java.util.Scanner scan = new java.util.Scanner(System.in);
      boolean done = false;
          
      while(!done)
      {
         System.out.println("positive integers -1 to stop:");
         int inNum = scan.nextInt();
         theStack.push(inNum);
              
         if(inNum < 0 )
         {
            done = true;
            int num;
            System.out.println("Please input another number");
            num = scan.nextInt();

            System.out.println("Last " + num + " numbers are :");
            while(counter < 3 && !theStack.isEmpty())
            {
               int value = theStack.pop();
               if(value >=0){
                   System.out.println(value);
               counter++;
               }
            }
         }    
      }
   }
}