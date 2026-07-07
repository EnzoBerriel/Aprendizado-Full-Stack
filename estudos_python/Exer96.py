#Funções
def introdução(str):
    print("-"*32)
    print(f"{str:^32}")
    print("-"*32, "\n")

def area(l,h):
    tot = l*h
    return tot


#introdução
introdução("Função que calcula área")
#Variaveis
altura = 1
largura = 1
#Requerimentno
altura = float(input("Digite a altura: "))
largura = float(input("Digite a largura: "))
#resposta
print(f"A Área do local é {area(largura,altura)}")


