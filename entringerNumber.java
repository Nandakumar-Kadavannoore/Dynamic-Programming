class MainClass {

  // Return Entringer Number E(n, k)
    public static int Entringer(int n, int k)
    {
        // Base Case
        if (n == 0 && k == 0)
            return 1;
      
        // Base Case
        if (k == 0)
            return 0;
      
        // Recursive step
        return Entringer(n, k - 1) +
               Entringer(n - 1, n - k);
    }

}
