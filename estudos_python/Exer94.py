"""Exercício Python 094: Crie um programa que leia nome, sexo e idade de várias pessoas, guardando os dados de cada pessoa em um dicionário e todos os dicionários em uma lista. No final, mostre: 
A) Quantas pessoas foram cadastradas
B) A média de idade
C) Uma lista com as mulheres
D) Uma lista de pessoas com idade acima da média"""

#Introdução
print("=-"*8," Unindo dicionários e listas","-="*8)
#Variaveis
pessoas_Cadastradas = []
pessoa = {"Nome": None, "Sexo": None, "Idade":None}
quant_Pessoas = 0
condicional = None
#Requerimento
while True:
    #Indivíduo
    pessoa["Nome"] = str(input("Nome:"))
    pessoa["Idade"] = int(input("Idade: "))
    pessoa["Sexo"] = str(input("Sexo[M/F]: ")).lower()
    #Condiconal sexualidade
    while pessoa["Sexo"]  not in ["masculino", "feminino", "f", "m"]:
        print("ERRO!!!! Digite novamente")
        pessoa["Sexo"] = str(input("Sexo[M/F]: ")).lower()
    #Armazenando Indivíduo
    pessoas_Cadastradas.append(pessoa.copy())
    #Condicional de Continuação
    condicional = str(input("Deseja Continuar[S/N]: ")).lower()
    while condicional not in ["s","n","sim","não","nao"]:
        print("ERRO!!!! Digite novamente")
        condicional = str(input("Deseja Continuar[S/N]: ")).lower()
    #Espaçamento
    print("=-"*16)
    #Condicional de Exit
    if condicional in ["n","não","nao"]:
        break
#Resposta
#Questão A
print(f"A) Ao todo temos {len(pessoas_Cadastradas)} pessoas Cadastradas.")
#Questão B
total = media = 0
for p in pessoas_Cadastradas:
    total += p["Idade"]
media = total / len(pessoas_Cadastradas)
print(f"B) A média de Idade é de {media} anos.")
#Questão C
print("C) Mulheres cadastradas foram: ", end="")
for p in pessoas_Cadastradas:
    if p["Sexo"] in ["f", "feminino"]:
        print(p["Nome"], end=", ")
#Questão D
print("D) lista de pessoas que ficaram acima da média")
for p in pessoas_Cadastradas:
    if p["Idade"] > media:
        for k, v in p.items():
            print(f"{k} = {v};", end=" ")
    print("\n")