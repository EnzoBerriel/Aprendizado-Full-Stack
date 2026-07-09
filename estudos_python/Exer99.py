#Funções
def título(text):
    #Quantidade de caracteres + espaçamento
    quant = len(text)+4
    #retorno
    print("-"*quant)
    print(f"{text:^{quant}}")
    print("-"*quant,"\n")

def biggest(lista):
    maior = lista[0]
    for c in lista:
        if c > maior:
            maior = c
    return maior


#Introdução
título("Função que descobre o maior")
#Variaveis
nums = []
quant = 0
#Requerimento
quant = int(input("Digite quantos elementos tem sua lista: "))
for c in range(quant):
    nums.append(int(input(f"Digite o {c+1} da Lista: ")))
#Resposta
print(f"O maior valor da lista é {biggest(nums)}")