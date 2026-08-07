#Crie um programa que tenha a função leiaInt(), que vai funcionar de forma semelhante 'a função input() do Python, só que fazendo a validação para aceitar apenas um valor numérico.
#Ex: n = leiaInt('Digite um n: ')

def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def readInt(text):
    while True:
        value = input(text)
        if value.isnumeric():
            return value
        else:
            print("Erro Digite Novamente...")

#main
título("Validando entrada de dados em Python")
n = readInt("Digite um número: ")
print(f"O valor {n} está correto.")