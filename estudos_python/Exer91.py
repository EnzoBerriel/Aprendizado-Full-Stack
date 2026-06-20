#Exercício Python 091: Crie um programa onde 4 jogadores joguem um dado e tenham resultados aleatórios. 
# Guarde esses resultados em um dicionário em Python. No final, coloque esse dicionário em ordem, sabendo 
#Variaveis
import random
numeros = [1,2,3,4]
Jogadores = {}
Time = [None] * len(numeros)
#requerimento
for c in range(0 , 4):
    Jogadores["Nome"] = str(input("Nome do Jogador: "))
    Jogadores["Numero"] = random.choice(numeros)
    Time[Jogadores["Numero"]- 1] = Jogadores.copy()
    numeros.remove(Jogadores["Numero"])
#Resposta
for c in Time:
    print(f"{c["Numero"]} posição {c["Nome"]}")