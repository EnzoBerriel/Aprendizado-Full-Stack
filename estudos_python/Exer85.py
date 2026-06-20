#Exercício Python 085: Crie um programa onde o usuário possa digitar sete valores numéricos e cadastre-os 
# em uma lista única que mantenha separados os valores pares e ímpares. No final, mostre os valores pares 
# e ímpares em ordem crescente.

pares = []
impares = []
for c in range(1,7):
    num = int(input(f"Digite o {c} Numero: "))
    if num % 2 == 0:
        pares.append(num)
    else:
        impares.append(num)
print("Números pares: ", pares)
print("Núeros ímpares: ", impares)