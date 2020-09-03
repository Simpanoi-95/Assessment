class Main {
  public static void main(String[] args) {
  }
   public static int getMissingInt(int[] num) {
 // A = new int[5];
    int n = num.length;  
    boolean[] digits = new boolean[n + 1]; 

    for(int k = 0; k < n; k++) 
    {
        if(num[k] <= n && num[k] >= 0) //Only positive integers
           digits[num[k]] = true;
    }

    for(int k = 0; k <= n; k++) 
    {
       if(digits[k] == false) 
          return k;
    } 
    return -1; //null
 }   
}
