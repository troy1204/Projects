public class QuickFind
{
    private int[] id;
    private int count; // number of components
    private int arr_counter = 0;

    public QuickFind(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    public int find(int p)
    { 
        return id[p]; 
    }
    public int count()
    { 
        return count; 
    }

    public void union(int p, int q)
    { 
        System.out.println("Doing union " + p + "-" + q);
        // Put p and q into the same component.
        int pID = find(p);
        int qID = find(q);
        // Nothing to do if p and q are already in the same component.
        if (pID == qID) return;
        // Rename p’s component to q’s name.
        for (int i = 0; i < id.length; i++){
            if (id[i] == pID){
                id[i] = qID;
                arr_counter++;
                for (int j = 0; j < 10; j++){
                    System.out.printf("%d ", id[j]);
                }
                System.out.println("");
            }
        } 
        System.out.println("");   
        count--;
    }
    public static void main(String args[])
    {
        QuickFind uf = new QuickFind(10);
        uf.union(9, 0);
        uf.union(3, 4);
        uf.union(5, 8);
        uf.union(7, 2);
        uf.union(2, 1);
        uf.union(5, 7);
        uf.union(0, 3);
        uf.union(4, 2);
        System.out.println("Array was accessed " + uf.arr_counter + " times.");
        System.out.println("Final ID Array is : ");
        for (int i = 0; i < 10; i++){
          System.out.println("[" + i +"]:"+uf.id[i]);
        }
    }
}
