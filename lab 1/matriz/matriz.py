import random
from time import time


matriz = []
for i in range(100):
    matriz.append([])
    for j in range(100):
      matriz[i].append(1)



matriz2 = []
for i in range(100):
    matriz2.append([])
    for j in range(100):
      matriz2[i].append(2)



matrizf = []
for i in range(100):
    matrizf.append([])
    for j in range(100):
      matrizf[i].append(0)

tiempo_inicial = time()

for i in range(0,100):
    for j in range(0,100):
      for k in range(0,100):
        matrizf[i][j] += matriz[i][k]*matriz2[k][j]

tiempo_final = time()

tiempo_ejecucion = tiempo_final - tiempo_inicial
print ('El tiempo de ejecucion fue:',tiempo_ejecucion)