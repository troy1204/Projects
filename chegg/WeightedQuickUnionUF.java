public class WeightedQuickUnionUF
{
  private int[] id; // parent link (site indexed)
  private int[] sz; // size of component for roots (site indexed)
  private int count; // number of components
  private int arr_counter = 0;

  public WeightedQuickUnionUF(int N)
  {
    count = N;
    id = new int[N];
    for (int i = 0; i < N; i++){
      id[i] = i;
    }
      
    sz = new int[N];
    for (int i = 0; i < N; i++) 
      sz[i] = 1;
  }

  public int count()
  { 
    return count; 
  }

  public boolean connected(int p, int q)
  { 
    return find(p) == find(q); 
  }

  private int find(int p)
  { // Follow links to find a root.
    while (p != id[p]) p = id[p];
    return p;
  }

  public void union(int p, int q)
  {
    System.out.println("Doing union " + p + "-" + q);
    int i = find(p);
    int j = find(q);
    if (i == j) return;
    // Make smaller root point to larger one.
    if (sz[i] < sz[j]) 
    { 
      id[i] = j; sz[j] += sz[i]; 
    }
    else 
    { 
      id[j] = i; sz[i] += sz[j]; 
    }
    arr_counter++;
    for (int k = 0; k < 10; k++){
      System.out.printf("%d ", id[k]);
    }
    System.out.println("");   
    count--;
  }

  public static void main(String args[])
  {
    WeightedQuickUnionUF uf = new WeightedQuickUnionUF(10);
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