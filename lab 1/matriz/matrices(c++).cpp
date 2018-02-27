#include <iostream>
#include <ctime>
using namespace std;

int main() {
int n,i,j,k;
cout << ("tamaño de las matrices: ")<<endl;
cin >> n;
int matriz[n][n];
for (i = 0; i < n; i++)
{
    for (j = 0; j < n; j++)
    {
      matriz[i][j] = 1;
    }
}


int matriz2[n][n];
for (i = 0; i <= n; i++)
{
    for (j = 0; j < n; j++)
    {
      matriz2[i][j] = 2;
    }
}


int matrizf[n][n];
for (i = 0; i <= n; i++)
{
    for (j = 0; j < n; j++)
    {
      matrizf[i][j] = 0;
    }
}
double tiempo_inicial, tiempo_final;
tiempo_inicial = clock();
for (i = 0; i <= n; i++){
    for (j = 0; j <= n; j++){
      for (k = 0; k <= n; k++){
        matrizf[i][j] += matriz[i][k]*matriz2[k][j];
      }
    }
}
tiempo_final = clock();
double time = (double(tiempo_final-tiempo_inicial)* 1000/CLOCKS_PER_SEC);
cout << "Execution Time: " << time << endl;
}