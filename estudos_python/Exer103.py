#Faça um programa que tenha uma função chamada ficha(), que receba dois parâmetros opcionais: o nome de um jogador e quantos gols ele marcou. O programa deverá ser capaz de mostrar a ficha do jogador, mesmo que algum dado não tenha sido informado corretamente.
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def validação(nome = None ,gols = None):
    if nome == None or nome == "":
        nome = "<Desconhecido>"
    if gols == None or gols == "":
        gols = 0
    else:
        if gols.isnumeric():
            gols = int(gols)
        else:
            gols = 0
        
    print(f"O {nome} fez {gols} no Campeonato")


#Main
título("Ficha do Jogador")
nome = str(input("Digite o nome do Jogador: "))
gols = str(input("Digite o número de gols: "))
validação(nome, gols)