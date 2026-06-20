#Exercício Python 084: Faça um programa que leia nome e peso de várias pessoas, guardando tudo em uma lista. No final, mostre:
#A) Quantas pessoas foram cadastradas.
#B) Uma listagem com as pessoas mais pesadas.
#C) Uma listagem com as pessoas mais leves.
lista = []
pessoas = []
#requerimentos
while True:
  pessoas.append(str(input("Digite seu nome: ")))
  pessoas.append(float(input("Digite seu peso: ")))
  lista.append(pessoas[:])
  pessoas.clear()
  ativo = str(input("Deseja continuar(S/N)"))
  if ativo in "Nn":
    break
#pessoas Cadastradas
print(f"Pessoas Cadastradas: {len(lista)}")
#Maior e menor peso
MA = ME = lista[0][1]
for c in lista:
  if c[1] > MA:
    MA = c[1]
  if c[1] < ME:
    ME = c[1]
print(f"Maior peso:{MA}\n"
      f"Menor peso:{ME}")
