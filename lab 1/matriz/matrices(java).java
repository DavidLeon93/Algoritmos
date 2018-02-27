import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("ingrese tamaño de las matrices: \n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j,k;
    int matriz[][] = new int[n][n];
    for (i = 0; i < n; i++)
    {
      for (j = 0; j < n; j++)
      {
        matriz[i][j] = 1;
      }
    }
    int matriz2[][] = new int[n][n];
    for (i = 0; i < n; i++)
    {
      for (j = 0; j < n; j++)
      {
        matriz2[i][j] = 2;
      }
    }
    int matrizf[][] = new int[n][n];
    for (i = 0; i < n; i++)
    {
      for (j = 0; j < n; j++)
      {
        matrizf[i][j] = 0;
      }
    }
    
    double time_start, time_end;
    time_start = System.currentTimeMillis();
    for (i = 0; i < n; i++)
    {
      for (j = 0; j < n; j++)
      {
        for (k = 0; k < n; k++)
        {
          matrizf[i][j] += matriz[i][k]*matriz2[k][j];
        }
      }
    }
    time_end = System.currentTimeMillis();
    System.out.println("el tiempo de ejecución fue: "+ ( time_end - time_start )/1000);

    /*for (i = 0; i < matrizf.length; i++)
    {
      for (j = 0; j < matrizf[i].length; j++)
      {
        System.out.println(matrizf[i][j] + " " ); verifico que la matriz final funciona
      }
      System.out.println();
    }
    */ 
  }
}