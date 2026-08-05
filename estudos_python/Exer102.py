# Crie um programa que tenha uma função fatorial() que receba dois parâmetros: o primeiro que indique o número a calcular e outro chamado show, que será um valor lógico (opcional) indicando se será mostrado ou não na tela o processo de cálculo do fatorial.
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def Fatorial(num,Demostração=False):
    tot = 1
    if Demostração == True:
        for c in range(num,1,-1):
            tot*= c
            print(f"{c} x ",end="")
        print(f"1 = {tot}")
    else:
        for c in range(num,1,-1):
            tot*= c
        print(tot)

título("Função para Fatorial")
num = int(input("Digite um número: "))
while True:
    condicional = str(input("Gostaria de Exibir o calculo[S/N]")).lower()
    if condicional in ["s","n","sim","não","nao"]:
        if condicional in ["s","sim"]:
            exibir = True
        else:
            exibir = False
        break
    print("ERRO!!! Tente Novamente.\n")
Fatorial(num, exibir)