#include <iostream>
using namespace std;
int fib(int n){
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
int main() 
{
cout<<("n-ésimo término deseado: ")<< endl;
int n;
cin >> n;
int i = 0;

	while (i <= n)
	{
	  if( fib(i) < 0){
	    cout << "overflow en: "<< i<< endl;
	    break;
	  }
	  if(i == n)
	  {
	    cout<<fib(i)<<endl;
	    
	  }
	  i += 1;
	  
  }
// int: overflow en 47
// short: overflow en 24
// long: overflow en 47
}