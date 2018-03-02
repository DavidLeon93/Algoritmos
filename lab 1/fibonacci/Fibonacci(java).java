import java.util.Scanner;
class Main {
  public static long fib(int n){
  int x,y,aux,i;
  x = 0;
  y = 1;
  aux = 0;
  i = 2;    
  if (n == 0)
  {
   return 0; 
  }
  if (n == 1){
    return 1; 
  }
  else
  { 
    while (i <= n)
    {
      aux = x + y;
      x = y;
      y = aux;
      i += 1;  
    }
    return aux;
  }
  }  
  public static void main(String[] args) {
    
	  System.out.println("ingrese n-ésimo término ");
	  Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
	  int i = 0;
	  while(i <= k)
	  {
		
		  if(fib(i)<0)
		  {
			
			  System.out.println("overflow en n = "+ i);
			  break;
		  }
		  if(i == k )
		  {
			  System.out.println(fib(i));
		  }
	
		  i+=1;
    }
  }
  // int: overflow en 47
  // Long: overflow en 47
  // short: overflow en 24
}
