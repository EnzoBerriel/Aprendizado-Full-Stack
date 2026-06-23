""" Crie um programa que gerencie o aproveitamento de um jogador de futebol. O programa vai ler o nome do jogador e quantas partidas ele jogou. Depois vai ler a quantidade de gols feitos em cada partida. No final, tudo isso será guardado em um dicionário, incluindo o total de gols feitos durante o campeonato."""

#Introdução
print("=-"*8,"Cadastro de Jogador de Futebol","-="*8)
#Variaveis
jogador = {}
gols = []
quant_Partidas = None
#Requerimento
jogador["Nome"] = str(input("Nome do jogador: "))
quant_Partidas = int(input(f"Quantas partidas {jogador['Nome']} jogou: "))
#Laço_1
for c in range(quant_Partidas):
    gols.append(int(input(f"Quantos gols na {c+1}° Partida: ")))
jogador["Gols"] = gols
#Laço_2
for k, v in jogador.items():
    print(f"{k}: {v}")
#Resposta
print(f"O jogador {jogador['Nome']} jogou {quant_Partidas} Partidas.")
#Laço_3
for c in range(quant_Partidas):
    print(f"=> Na partida {c+1}, marcou {jogador['Gols'][c]} Gols")