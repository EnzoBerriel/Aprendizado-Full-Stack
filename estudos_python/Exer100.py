#Importações
from random import randint
#Funções
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def nums_Sorteados(quant, lista):
    título("Números entre 0 e 100 foram sorteados")
    for c in range(quant):
        lista.append(randint(0,100))
    print("Lista: ",lista)

def somaPar(lista):
    tot = 0
    for c in lista:
        if c % 2 == 0:
            tot+=c
    if tot == 0:
        print("Nenhum número par obtido.")
    else:
        print(f"A soma de todos os números pares é {tot}")


#Introdução
título("Funções para sortear e somar")
#Varivaveis
Lista = []
quant = 0
#Requerimentos
quant =int(input("Quantos números serão Sorteados: "))
#Função_1
nums_Sorteados(quant,Lista)
#Função_2
somaPar(Lista)