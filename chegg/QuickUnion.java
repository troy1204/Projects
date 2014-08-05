public class QuickUnion
{
    private int[] id;
    private int count; // number of components
    private int arr_counter = 0;

    public QuickUnion(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    public int find(int p)
    { 
        // Find component name.
        while (p != id[p]) p = id[p];
            return p;
    }
    public int count()
    { 
        return count; 
    }

    public void union(int p, int q)
    { 
        System.out.println("Doing union " + p + "-" + q);
        // Give p and q the same root.
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;
        id[pRoot] = qRoot;
            count--;
        arr_counter++;
        for (int j = 0; j < 10; j++){
            System.out.printf("%d ", id[j]);
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        QuickUnion uf = new QuickUnion(10);
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
